package com.mota.task7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Pipe;

public class MyPipe {
    Pipe pipe;

    public MyPipe() throws IOException {
        this.pipe = Pipe.open();
        pipe.sink().configureBlocking(false);
    }

    void readFromFileToPipe() {
        try (
                BufferedReader reader = new BufferedReader(new FileReader("src/main/java/com/mota/task7/text.txt"))
        ) {
            Pipe.SinkChannel sinkChannel = pipe.sink();

            String line;
            while ((line = reader.readLine()) != null) {
                sinkChannel.write(ByteBuffer.wrap((line + '\n').getBytes()));

            }
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    void readFromPipe() throws IOException {
        Pipe.SourceChannel sourceChannel = pipe.source();
        ByteBuffer buffer = ByteBuffer.allocate(256);
        int what = 0;
        while (sourceChannel.read(buffer) != -1) {
            buffer.flip();
            System.out.print(new String(buffer.array()));
            buffer.clear();
        }
    }

    public static void main(String[] args)  throws IOException{
        MyPipe pipeTest = new MyPipe();
        new Thread(() -> {
            try {
                pipeTest.readFromPipe();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).start();
        new Thread(() -> {
            pipeTest.readFromFileToPipe();

        }).start();

    }

}
