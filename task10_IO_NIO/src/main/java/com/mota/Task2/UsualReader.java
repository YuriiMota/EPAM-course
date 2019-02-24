package com.mota.Task2;

import java.io.*;

public class UsualReader {
    public static void main(String[] args) {
        long start = System.nanoTime();
        try(Reader reader = new FileReader("Pragmatic.pdf");
            Writer writer = new FileWriter("task3_1.txt")){
            int c;
            while ((c = reader.read()) != -1) {

                writer.write((char) c);
            }
        }catch (IOException ex){
            ex.printStackTrace();
        }
        long end = System.nanoTime()-start;
        System.out.println("Duration: "+end);



    }
}
