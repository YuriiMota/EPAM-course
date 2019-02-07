package epam.MusicShop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MusicShop {
    public static void print(List<MusicInstrument> musicInstrument) {
        for (MusicInstrument mi : musicInstrument) {
            System.out.print(mi.getType() + " ");
            System.out.print(mi.getCompany() + " ");
            System.out.print("Country: " + mi.getCountry() + " ");
            System.out.println("Price: " + mi.getPrice() + "$ ");
            System.out.println("Weight: " + mi.getWeight() + " ");
        }
    }

    public static void main(String args[]) throws ClassNotFoundException {
        List<MusicInstrument> musicInstruments = new ArrayList<MusicInstrument>() {
            {
                add(new Saxophone(12, 32321, "Saxophone", Country.ENGLAND, Company.DRUMDRUM));
                add(new Tube(6, 520, "Tube", Country.DENMARK, Company.GIBSON));
                add(new Guitar(5, 13000, "Guitar", Country.DENMARK, Company.GIBSON));
                add(new Guitar(7, 6500, "Guitar", Country.ENGLAND, Company.LESPAUL));
                add(new Guitar(2, 21000, "Guitar", Country.UKRAINE, Company.YAMAHA));
                add(new BassGuitar(8, 5500, "BassGuitar", Country.USA, Company.GIBSON));
                add(new Accordeon(7, 10000, "Accordeon", Country.USA, Company.GIBSON));
                add(new Piano(50, 54000, "Piano", Country.ENGLAND, Company.GIBSON));
                add(new Drums(32, 28000, "Drums", Country.DENMARK, Company.GIBSON));
                add(new Drums(30, 17000, "Drums", Country.UKRAINE, Company.GIBSON));
                add(new BassDrum(3, 3000, "BassDrum", Country.DENMARK, Company.GIBSON));
            }
        };


        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to find music instruments by their type(Winds, Strings, Keyboards, Drums Intrument)" +
                "  or see all kinds of this types instruments?\n 1. Find by type (Winds, Strings, Keyboards, Drums Intrument" +
                "\n 2. Find by kinds of types");
        int i = sc.nextInt();
        if (i == 1) {
            int n = 0;
            while (n != 5) {
                System.out.println("\nChoose your  type of instrument");
                System.out.println("1.StringsInstrument 2.DrumsInstrument 3.WindsInstrument 4.KeyboardsInstrument 5.Exit");
                n = sc.nextInt();

                String nameClass[]={"Epam.MusicShop.StringsInstrument","Epam.MusicShop.DrumsInstrument","Epam.MusicShop.WindsInstrument","Epam.MusicShop.KeyboardsInstrument"};
                switch (n) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                        for (MusicInstrument mi : musicInstruments) {
                            if (Class.forName(nameClass[n-1]).isInstance(mi) )
                                //(Class.forName(nameClass[n-1]).isAssignableFrom(mi.getClass()))
                                mi.print();
                        }
                        break;

                    case 5:
                        System.out.println("Thank you for visiting. Goodbye ");
                        break;
                    default:
                        System.out.println("Incorrect value. Try again");
                }

            }
        } else {
            //Sort by weight
            PersonalComparator personalComparator = new PersonalComparator();
            musicInstruments.sort(personalComparator);

            int n = 0;
            while (n != 9) {
                System.out.println("\nChoose kind of instruments");
                System.out.println("1.Guitar 2.BassGuitar 3.Drums 4.BassDrum 5.Accordeon 6.Piano 7.Tube 8.Saxophone 9. Exit");
                n = sc.nextInt();
                String instr[] = {"Guitar", "BassGuitar", "Drums", "BassDrum", "Accordeon", "Piano", "Tube", "Saxophone"};
                switch (n) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        for (MusicInstrument mi : musicInstruments) {
                            if (mi.getType().equals(instr[n - 1]))
                                mi.print();
                        }
                        break;
                    case 9:
                        System.out.println("Thank you for visiting. Goodbye ");
                        break;
                    default:
                        System.out.println("Incorrect value. Try again");
                }

            }
        }
    }
}