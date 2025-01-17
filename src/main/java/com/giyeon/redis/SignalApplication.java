package com.giyeon.redis;

import sun.misc.Signal;

public class SignalApplication {
    public static void main(String[] args) throws InterruptedException {
        Signal.handle(new Signal("INT"), sig -> {
            System.out.println("SIGINT 받음!!!!!!!");
            // System.exit(0);
        });

        while(true){
            System.out.println("test");
            Thread.sleep(1000);
        }
    }
}