package com.mota.Task5;

import java.io.File;
import java.io.IOException;


public class Directory {
   public static void main(String[] args) throws IOException {

        File folder = new File("G:\\Work\\EPAM\\Homework\\task09_JUNIT");
        File[] listOfFiles = folder.listFiles();
       System.out.println(folder.getAbsolutePath());
        for (int i = 0; i < listOfFiles.length; i++) {
            if (listOfFiles[i].isFile()) {
                System.out.println("File " + listOfFiles[i].getName());
            } else if (listOfFiles[i].isDirectory()) {
                System.out.println("Directory " + listOfFiles[i].getName());

            }
        }
    }
}
