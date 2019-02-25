package com.mota.task2;

public class Fibonacci extends Thread {
    int n;

    public Fibonacci(int n) {
        this.n = n;
    }

    public void fibonachi(int n) {
        int a=1;
        int b=1;
        int f;
        if (n==1)System.out.print(a+" ");
        else System.out.print(a+" "+b+" ");
        for(int i=2;i<n;i++)
        {
            f=a+b;
            a=b;
            b=f;
            System.out.print(f+" ");
        }
    }

    @Override
    public void run() {
        System.out.println();
        fibonachi(n);
    }

    public static void main(String[] args) {

            Fibonacci fibonacci = new Fibonacci(10);
            fibonacci.start();



    }
}
