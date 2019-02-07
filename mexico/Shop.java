package epam.mexico;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Shop {


    List<Flower> flower = new ArrayList<>();
    List<Palm> palm = new ArrayList<>();
    List<Pot> pot = new ArrayList<>();
    List<Posy> posy = new ArrayList<>();
    List<Wrapper> wrapper = new ArrayList<>();

    {

        flower.add(new Tulip("Tulip", Color.RED, Localization.FOREIGN, Growing.GARDEN, 22, 30));
        flower.add(new Rose("Rose", Color.MAROON, Localization.FOREIGN, Growing.GARDEN, 20, 40));
        flower.add(new Marigold("Marigold", Color.MIMOSA, Localization.LOCAL, Growing.POT, 15, 37.50f));
        flower.add(new Kaktus("Kaktus", Color.GREEN, Localization.LOCAL, Growing.POT, 50, 350));
        flower.add(new Carnation("Carnation", Color.RED, Localization.FOREIGN, Growing.GARDEN, 17, 20));


        palm.add(new Palm(1,"Palm", Color.GREEN, Localization.LOCAL, Growing.GARDEN, 120, 3000));

        pot.add(new Pot(1, Size.S, Color.GREEN));
        pot.add(new Pot(2, Size.M, Color.RED));
        pot.add(new Pot(3, Size.L, Color.MARSALA));
        pot.add(new Pot(4, Size.XL, Color.AZURE));

        posy.add(new Posy(1, "101 Roses", 2300));
        posy.add(new Posy(2, "7 tulips", 200));
        posy.add(new Posy(32, "Happy birthday", 250));
        posy.add(new Posy(43, "For You", 100));

        wrapper.add(new Wrapper(1,Size.M,Color.AZURE,15));
    }

    public void printCatalog() {
        int n = 0;
        Scanner sc = new Scanner(System.in);
        while (n != 9) {

            System.out.println("Choose your action (enter the number from 1 to 8)");
            System.out.println("1-View all flowers\t2-View foreign flowers\t3-View local flowers\t4-" +
                    "View palms\t5-View posys\t6-View pots\t7-All service\t8-Discounts\t9-Exit ");
            n = sc.nextInt();
            switch (n) {
                case 1:
                    printFlowers();
                    break;
                case 2:
                    printForeignFlowers();
                    break;
                case 3:
                    printLocalFlowers();
                    break;
                case 4:
                    printPalms();
                    break;
                case 5:
                    printPosy();
                    break;
                case 6:
                    printPot();
                    break;
                case 7:
                    printAll();
                    break;
                case 8:
                    printDiscount();
                    break;
                case 9:
                    break;
                default:
                    System.out.println("Incorrect value");
            }

        }
    }

    void makePosy() {
        int n = 0;
        float sum = 0f;
        float price = 0f;
        int count = 1;
        int present=0;
        Scanner sc = new Scanner(System.in);
        printDiscount();
        while (n != 6) {


            System.out.println("Choose your flower (enter the number from 1 to 6)");
            System.out.println("1-Tulips\t2-Rose\t3-Marigold\t4-" +
                    "Kaktus\t5-Carnation\t6-Exit ");
            n = sc.nextInt();
            String kindflow[] = {"Tulip", "Rose", "Marigold", "Kaktus", "Carnation"};
            switch (n) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    System.out.println("Choose count of flowers");
                    count = sc.nextInt();
                    present=count/5;
                    for (Flower fl : flower) {
                        if (fl.getKind().equals(kindflow[n - 1])) {
                            sum += fl.getPrice() * count;
                            System.out.println(count + " " + fl.getKind() + "(`s)  costs " + fl.getPrice() * count + " grn");
                            if (present>0) System.out.println(present+" flower(s) in present");
                            System.out.println("Current price: " + sum + " grn");
                        }
                    }
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Incorrect value");
            }


        }
        sum=discount(sum);
        System.out.println("Additional service\n1.Buy pot\n2.Wrap the flowers\n3.Without anything");
        n = sc.nextInt();
        if (n == 1)
            price = buyPot();
        else if (n == 2)
            // price for wrapper
            price = buyWrapper();
        sum += price;
        System.out.println("Current price: " + sum);
        sum += delivery(sum);
        System.out.println("Total price: " + sum + "grn");
        payment();

    }

    public float discount(float sum) {
        if (sum >= 300 && sum < 500) {
            sum *= 0.9;
            System.out.println("Your price with 10% discount: "+sum+" grn");
        } else if (sum >= 500) {
            sum*=0.8;
            System.out.println("Your price with 20% discount: "+sum+" grn");
        }

        return sum;
    }



    public float buyPot() {
        Scanner sc = new Scanner(System.in);
        float sum = 0;
        int n = 0;
        while (n != 5) {
            System.out.println("Choose your pot (enter the number from 1 to 5)");
            System.out.println("1-S\n2-M\n3-L\n4-XL\n5-Exit ");
            n = sc.nextInt();
            switch (n) {
                case 1:
                case 2:
                case 3:
                case 4:
                    for (Pot p : pot) {
                        if (p.getId() == n) {
                            sum += p.getSize().getPrice();
                            //System.out.println("Current price: " + sum + " grn");
                        }
                    }
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Incorrect value");
            }

        }
        //System.out.println("Total price: " + sum + "grn");
        return sum;
    }
    public float buyWrapper() {
        Scanner sc = new Scanner(System.in);
        float sum = 0;
        int n = 0;
        char c = 'y';

        for (Wrapper wr : wrapper) {
            System.out.println(wr);
        }

        while (c != 'N' && c != 'n') {
            System.out.println("\tChoose the wrapper. Enter id number");

            n = sc.nextInt();

            for (Wrapper wr : wrapper) {
                if (wr.getId() == n)
                    sum += wr.getPrice();
            }

            System.out.println("Do you want to buy one more wrapper. Enter Y/N");
            c = sc.next().charAt(0);

        }

        return sum;
    }

    void buyPosy() {
        Scanner sc = new Scanner(System.in);
        float sum = 0;
        int n = 0;
        char c = 'y';

        for (Posy p : posy) {
            System.out.println("id:" + p.getId() + "- \"" + p.getName() + "\": " + p.getPrice());
        }

        while (c != 'N' && c != 'n') {
            System.out.println("\tChoose the posy. Enter id number");

            n = sc.nextInt();

            for (Posy p : posy) {
                if (p.getId() == n)
                    sum += p.getPrice();
            }

            System.out.println("Do you want to buy posy. Enter Y/N");
            c = sc.next().charAt(0);

        }
        System.out.println("Current price: " + sum);
        sum += delivery(sum);

        System.out.println("Total price: " + sum + "grn");
        payment();
    }
    void buyPalm() {
        Scanner sc = new Scanner(System.in);
        float sum = 0;
        int n = 0;
        char c = 'y';

        for (Palm p : palm) {
            System.out.println(p);
        }

        while (c != 'N' && c != 'n') {
            System.out.println("\tChoose the palm. Enter id number");

            n = sc.nextInt();

            for (Palm p : palm) {
                if (p.getId() == n)
                    sum += p.getPrice();
            }

            System.out.println("Do you want to buy another palm. Enter Y/N");
            c = sc.next().charAt(0);

        }
        System.out.println("Current price: " + sum);
        sum += delivery(sum);

        System.out.println("Total price: " + sum + "grn");
        payment();
    }
    float delivery(float sum) {
        Scanner scanner = new Scanner(System.in);
        int n = 5;

        while (n > 4) {
            System.out.println("Choose the method of delivery (enter the number from 1 to 4");
            System.out.println("1-Ukrposhta(10% from price)\n2-Nova Poshta (12% from price)\n3-Courier delivery(20% from price)\n4-Without delivery");
            n = scanner.nextInt();

            switch (n) {
                case 1:
                    sum *= 0.1;
                    break;
                case 2:
                    sum *= 0.12;
                    break;
                case 3:
                    sum *= 0.2;
                    break;
                case 4:
                    sum=0;
                    break;
                default:
                    System.out.println("Incorrect number");
            }
        }
        return sum;
    }

    void payment() {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        System.out.println("How would you like to pay?\n1.By cash\n2.By card");
        n = scanner.nextInt();
        System.out.println("Thank you for purchase");

    }

    void printDiscount() {
        System.out.println("Discounts\n\t1. If you buy flowers for the total amount more than 300 hryvnas" +
                " then you will get a discount of 10%");
        System.out.println("\t2. If you buy flowers for the total amount more than 500 hryvnas" +
                " then you will get a discount of 20%");
        System.out.println("\t3. Every 5 flowers 1 in present");
    }

    void printPosy() {
        System.out.println("\tPosy");
        for (Posy p : posy) {
            System.out.println(p);
        }
    }

    void printPot() {
        System.out.println("\tPots");
        for (Pot p : pot) {
            System.out.println(p);
        }
    }

    void printFlowers() {
        System.out.println("\tFlowers");
        for (
                Flower flow : flower) {
            System.out.println(flow);
        }
    }

    void printForeignFlowers() {
        System.out.println("\tForeign flowers");
        for (
                Flower flow : flower) {
            if (flow.getLocalization() == Localization.FOREIGN)
                System.out.println(flow);
        }
    }


    void printLocalFlowers() {
        System.out.println("\tLocal flowers");
        for (
                Flower flow : flower) {
            if (flow.getLocalization() == Localization.LOCAL)
                System.out.println(flow);
        }
    }

    void printAll() {
        printFlowers();
        printPalms();
        printPosy();
        printPot();
    }

    void printPalms() {
        System.out.println("\tPalms");
        for (Palm palm1 : palm) {
            System.out.println(palm1);
        }
    }


}
