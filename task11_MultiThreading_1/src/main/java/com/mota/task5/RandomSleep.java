package com.mota.task5;

import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class RandomSleep implements Runnable{
    ScheduledExecutorService scheduledExecutorService;

    public RandomSleep(int n) {
        scheduledExecutorService = Executors.newScheduledThreadPool(n);
    }

    @Override
    public void run() {
        int delay = new Random().nextInt(10)+1;
        scheduledExecutorService.schedule(()-> System.out.println(Thread.currentThread()+" Delay "+delay),delay, TimeUnit.SECONDS);

    }

    public static void main(String[] args) {
        RandomSleep randomSleep = new RandomSleep(10);
        for (int i = 0; i <10 ; i++) {
            randomSleep.run();

        }
    }
}
