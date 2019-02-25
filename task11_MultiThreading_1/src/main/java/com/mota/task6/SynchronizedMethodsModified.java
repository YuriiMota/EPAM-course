package com.mota.task6;

public class SynchronizedMethodsModified extends Thread {
    Object object1 = new Object();
    Object object2 = new Object();
    Object object3 = new Object();
    public void method1() {
        synchronized (object1) {
            int result = 0;
            System.out.println("Method 1 starts");
            for (int i = 0; i < 100; i++) {
                result += i;
            }
            System.out.println("Result = " + result);
            System.out.println("Method 1 ends");
        }
    }

    public  void method2() {
        synchronized (object2) {
        int result = 0;
        System.out.println("Method 2 starts");
        for (int i = 0; i < 100; i++) {
            result += i;
        }
        System.out.println("Result = " + result);
        System.out.println("Method 2 ends");
    }}

    public  void method3() {
        synchronized (object3) {
        int result = 0;
        System.out.println("Method 3 starts");
        for (int i = 0; i < 100; i++) {
            result += i;
        }
        System.out.println("Result = " + result);
        System.out.println("Method 3 ends");
    }}

    @Override
    public void run() {
        long start=System.nanoTime();

        method1();
        method2();
        method3();
        System.out.println(System.nanoTime()-start);
    }

    public static void main(String[] args) {
        long start=System.nanoTime();
        SynchronizedMethods2 synchronizedMethods2 = new SynchronizedMethods2();
        synchronizedMethods2.start();
        System.out.println(System.nanoTime()-start);
    }
}
