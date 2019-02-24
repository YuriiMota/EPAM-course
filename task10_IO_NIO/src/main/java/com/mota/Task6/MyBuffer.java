package com.mota.Task6;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.channels.FileChannel;
import java.util.Arrays;

public class MyBuffer {
    public static void read(String path) throws IOException {
        FileChannel fileChannel = new FileInputStream(path).getChannel();
        //create buffer with capacity of 128 bytes
        ByteBuffer byteBuffer = ByteBuffer.allocate(128);
        int byteRead=fileChannel.read(byteBuffer); //write into buffer.
        while(byteRead!=-1){
            byteBuffer.flip(); //make buffer ready for read from
            IntBuffer intBuffer = byteBuffer.asIntBuffer();
            while (intBuffer.hasRemaining()){
                System.out.println( intBuffer.get()); // read 1 byte at a time
            }
            byteBuffer.clear();  //make buffer ready for writing into
            byteRead = fileChannel.read(byteBuffer);

        }
        fileChannel.close();
    }
    public static void write(String path, int[]data) throws IOException{
        FileChannel fileChannel = new FileOutputStream(path).getChannel();
        ByteBuffer byteBuffer = ByteBuffer.allocate(data.length*4);
        Arrays.stream(data).forEach(byteBuffer::putInt);
        byteBuffer.flip();
        fileChannel.write(byteBuffer);
        fileChannel.close();


    }

    public static void main(String[] args) throws IOException {
        MyBuffer.write("task6.txt",new int[]{3,5,6,3,5,6});
        MyBuffer.read("task6.txt");
    }
}
