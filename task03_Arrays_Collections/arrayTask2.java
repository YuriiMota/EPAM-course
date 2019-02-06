package epam.SimpleTasks;

import java.util.Arrays;
import java.util.Random;

public class arrayTask2 {
    static int[] newMas(int mas1[]){
        int k;
        int size=0;
        for (int i = 0; i < mas1.length; i++) {
            k=0;
            for (int j = 0; j < mas1.length; j++) {
                if (mas1[i]==mas1[j]) k++;

            }
            if (!(k>2)) size++ ;
        }

        System.out.println(Arrays.toString(mas1));

        int l=0;
        int[] mas2 = new int[size];
        for (int i = 0; i < mas1.length; i++) {
            k=0;
            for (int j = 0; j < mas1.length; j++) {
                if (mas1[i]==mas1[j]) k++;

            }
            if (!(k>2)) {
                mas2[l++]=mas1[i];

            }
        }
        return mas2;
    };

    public static void main(String[] args) {
        Random random = new Random();
        int[] mas1 = new int[10];

        for (int i = 0; i < mas1.length; i++) {
            mas1[i]=random.nextInt(5);
        }

        int[] mas2 =newMas(mas1);
        System.out.println(Arrays.toString(mas2));
    }

}
