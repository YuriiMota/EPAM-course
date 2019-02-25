package com.mota.task6;

public class SynchronizedMethods2  extends Thread{
    public void method1() {
        synchronized (this) {
            int result = 0;
            System.out.println("Method 1 starts");
            for (int i = 0; i < 100; i++) {
                result += i;
            }
            System.out.println("Result = " + result);
            System.out.println("Method 1 ends");
        }
    }

    public synchronized void method2() {

        int result = 0;
        System.out.println("Method 2 starts");
        for (int i = 0; i < 100; i++) {
            result += i;
        }
        System.out.println("Result = " + result);
        System.out.println("Method 2 ends");
    }

    public synchronized void method3() {

        int result = 0;
        System.out.println("Method 3 starts");
        for (int i = 0; i < 100; i++) {
            result += i;
        }
        System.out.println("Result = " + result);
        System.out.println("Method 3 ends");
    }

    @Override
    public void run() {
        long start=System.nanoTime();

        method1();
        method2();
        method3();
        System.out.println(System.nanoTime()-start);
    }

    public static void main(String[] args) {
        SynchronizedMethods2 synchronizedMethods2 = new SynchronizedMethods2();
        synchronizedMethods2.start();

    }
}
