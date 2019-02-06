package epam.SimpleTasks;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class arrayTask4 {
    public static void openTheDoor(int health) {
        int[] points = generateDoors();

        int number[] = new int[10];
        for (int i = 0; i < 10; i++) {
            number[i] = points[i];
        }
        Arrays.sort(points);
        System.out.println(Arrays.toString(points));
        for (int i = 9; i >= 0; i--) {
            for (int j = 0; j < 10; j++) {
                if (number[j] == points[i]) System.out.print(j + " ");
            }

        }

    }


    public static int[] generateDoors() {
        Random random = new Random();
        int[] mas = new int[10];

        for (int i = 0; i < 10; i++) {
            if (random.nextInt(2) == 0)
                mas[i] = random.nextInt(71) + 10;
            else
                mas[i] = random.nextInt(96) - 100;
        }
        for (int i = 0; i < 10; i++) {
            System.out.print("Door " + i + ": ");
            if (mas[i] < 0)
                System.out.println("Monster " + mas[i] + " points");
            else
                System.out.println("Artifact +" + mas[i] + " points");
        }
        return mas;
    }

    public static void main(String[] args) {

        int hero = 25;
        openTheDoor(hero);
    }
}
