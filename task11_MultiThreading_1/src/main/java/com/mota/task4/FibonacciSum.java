package com.mota.task4;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class FibonacciSum implements Callable<Integer> {
    int n;

FibonacciSum(int n){
this.n=n;

}
    public void sun(){

    }
    public int fibonacci(int n) {
        if(n < 2){

            return n;
        }
        else{
            int f = fibonacci(n-2)+fibonacci(n-1);

            return f;
        }
    }

    @Override
    public Integer call() throws Exception {
        int sum=0;


        for (int i = 0; i < n; i++) {

            sum+=fibonacci(n);
        }
        return sum;
    }

    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(10);
        List<Future<Integer>> futures = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            futures.add(service.submit(new FibonacciSum(i)));
        }
        service.shutdown();
        TimeUnit.SECONDS.sleep(1);
        for (Future<Integer> future : futures) {
            if (future.isDone()) {
                try {
                    System.out.println(future.get());
                } catch (ExecutionException | InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }}
