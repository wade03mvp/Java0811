package com.pcschool.ocp.d10.case6;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueDemo2 {
    public static void main(String[] args) {
        Queue<String> queue = new ArrayBlockingQueue<>(3);
        System.out.println(queue.offer("John"));
        System.out.println(queue.offer("Mary"));
        System.out.println(queue.offer("Helen"));
        System.out.println(queue.offer("Jane")); // 試著將 offer 換成 add (出現例外)
        System.out.println(queue);
    }
}
