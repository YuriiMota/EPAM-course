package epam;

import java.util.Scanner;

public class Crypto {
    public static void main(String args[]) {
        System.out.println("Enter line");
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int n =S.length();
        String Mas[]=new String[n];

        for(int i=0;i<n;i++) {
            Mas[i]=S.substring(i, n)+S.substring(0,i);
            System.out.println(Mas[i]);
        }

        String buf;
        for(int k=n-1;k>0;k--){
            for(int i=0;i<k;i++ ) {
                if (Mas[i].compareTo(Mas[i+1])>0) {
                    buf=Mas[i];
                    Mas[i]=Mas[i+1];
                    Mas[i+1]=buf;
                }
            }
        }
        System.out.println("\t Sorted");

        for(int i=0;i<n;i++) {
            if (Mas[i].equals(S)) n=i;
            System.out.println(Mas[i]);
        }
        System.out.println("\t Number of line");
        System.out.println(n+1);
        System.out.println("\t Last letters");
        for(int i=0;i<n;i++) {
            System.out.print(Mas[i].charAt(n-1));
        }
    }
}