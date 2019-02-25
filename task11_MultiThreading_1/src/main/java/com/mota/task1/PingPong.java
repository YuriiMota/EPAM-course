package com.mota.task1;

import java.util.concurrent.TimeUnit;

public class PingPong {
    private volatile Integer count;

    public void play(int n) {
        count=n;
        Thread ping = new Thread(() -> {
            synchronized (count) {
                for (int i = 0; i < count; i++) {
                    try {
                        TimeUnit.SECONDS.sleep(1);
                        count.wait();
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }

                    System.out.println("\033[33mPing");
                    count.notify();
                }

            }
        }

        );
        Thread pong = new Thread(() -> {
            synchronized (count) {
                for (int i = 0; i < count; i++) {
                    count.notify();
                    try {
                        TimeUnit.SECONDS.sleep(1);
                        count.wait();
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    System.out.println("\033[31m\tPong");

                }

            }
        }
        );
        ping.start();
        pong.start();
    }

    public static void main(String[] args) {
        PingPong pingPong = new PingPong();
        pingPong.play(5);
    }
}
