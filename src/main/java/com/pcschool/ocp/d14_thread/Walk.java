package com.pcschool.ocp.d14_thread;

public class Walk implements Runnable {

    private static boolean gameover; // static 可共用變數

    @Override
    public void run() {
        job();
    }

    private void job() {
        String tName = Thread.currentThread().getName();
        for (int i = 1; i <= 1000 && !gameover; i++) {
            System.out.printf("%s 跑了 %d 步\n", tName, i);
        }
        gameover = true; // 有人跑完就結束比賽
    }
}
