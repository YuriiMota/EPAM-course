package com.mota.task3;

import com.mota.task2.Fibonacci;

import java.util.concurrent.*;

public class ExecutorFibonacci {
    void run(ExecutorService executorService, int n){

            executorService.execute(new Fibonacci(n));

        executorService.shutdown();
    }
    public static void main(String[] args) throws InterruptedException {
        ExecutorFibonacci executorFibonacci = new ExecutorFibonacci();
        System.out.print("Cashed Thread pool");
        executorFibonacci.run(Executors.newCachedThreadPool(),8 );
        Thread.sleep(1000);
        System.out.print("\nSingleThreadExecutor");
        executorFibonacci.run(Executors.newSingleThreadExecutor(),8);
        Thread.sleep(1000);
        System.out.print("\nFixedThreadPool");
        executorFibonacci.run(Executors.newFixedThreadPool(3),8);


    }
}
