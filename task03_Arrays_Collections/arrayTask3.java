package epam.SimpleTasks;

import java.sql.Array;
import java.util.Arrays;
import java.util.Random;

public class arrayTask3 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] mas1 = new int[20];
        for (int i = 0; i < mas1.length; i++) {
            mas1[i]=random.nextInt(5);
        }
        System.out.println(Arrays.toString(mas1));
        for (int i = 0; i < mas1.length; i++) {
            if (i==mas1.length-1){
                System.out.print(mas1[i]+" ");
                break;
            }
            if (mas1[i]==mas1[i+1]) continue;
            else System.out.print(mas1[i]+" ");

                }
        }
    }

