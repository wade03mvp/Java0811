package com.pcschool.ocp.d14_thread;

import java.util.Arrays;
import java.util.Random;

public class ThreadDemo {
    public static void main(String[] args) {
        final Random r = new Random();
        Runnable w1 = () -> System.out.println(r.nextInt(9)+ 1);   // 1~9 取亂數
        Runnable w2 = () -> System.out.println(r.nextInt(10)+ 10); // 10~19 取亂數
        Runnable w3 = () -> System.out.println(r.nextInt(10)+ 20); // 20~29 取亂數
        Runnable w4 = () -> System.out.println(r.nextInt(10)+ 30); // 30~39 取亂數
        
        Thread t1 = new Thread(w1);
        Thread t2 = new Thread(w3);
        t1.start();
        t2.start();
        
        // Java 8
        Runnable[] rs = {w1, w2, w3, w4};
        Arrays.stream(rs).forEach(w -> new Thread(w).start());
    }
}
