package com.mota.Task4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CommentReader {
        //@throws IOException
        //create CommentReader class
    static String readComment(String path) throws IOException{
        StringBuilder stringBuilder = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(
                new FileReader(path));
        String line;
        while ((line = bufferedReader.readLine())!=null){
            int index  = line.indexOf("//");
            if(index>0){
                stringBuilder.append(line.substring(index+2)).append('\n');
            }
        }
        bufferedReader.close();
        return stringBuilder.toString();
    }
    public static void main(String[] args) throws IOException {
        System.out.println(readComment("C:\\Users\\Yura\\" +
                "IdeaProjects\\task10_IO_NIO\\src\\main\\java\\com\\mota\\Task4\\CommentReader.java"));
    }
}
