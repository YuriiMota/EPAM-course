package epam.mexico;

import java.util.Scanner;

public class Catalog {
    public static void main(String args[]) {

        Shop shop = new Shop();
        Scanner sc = new Scanner(System.in);

        int n = 0;
        while (n!=5) {
            System.out.println("Choose the option\n1-View catalog\n2-Buy flowers or make the posy\n" +
                    "3-Buy posy\n4-Buy palm\n5-Exit");
             n = sc.nextInt();
            switch (n) {
                case 1:
                    shop.printCatalog();
                    break;
                case 2:
                    shop.makePosy();
                    break;
                case 3:
                    shop.buyPosy();
                    break;
                case 4:
                    shop.buyPalm();
                    break;
                case 5:
                    System.out.println("Thank you for visiting. Goodbye ");
                    break;
                default:
                    System.out.println("Incorrect number. Try again");
            }
        }

    }
}
