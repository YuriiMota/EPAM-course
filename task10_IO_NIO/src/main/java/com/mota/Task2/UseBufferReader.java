package com.mota.Task2;

import java.io.*;

public class UseBufferReader {
    public static void main(String[] args) {
        int sizeOfBuffer = 128;
        for (int i = 1; i < 11; i++) {
            long start = System.nanoTime();
            try (BufferedReader reader = new BufferedReader(new FileReader("Pragmatic.pdf"), sizeOfBuffer*i);
                 BufferedWriter writer = new BufferedWriter(new FileWriter("task3_2.txt"))) {
                int c;
                while ((c = reader.read()) != -1)
                    writer.write((char) c);

            } catch (IOException ex) {
                ex.printStackTrace();
            }
            long end = System.nanoTime()-start;
            System.out.println("Duration: "+i+" "+end);
        }

    }
}
