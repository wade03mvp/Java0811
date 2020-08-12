package com.pcschool.ocp.game;

import java.util.Scanner;

public class JavaGame {
    public static void main(String[] args) { 
        menu(); // 主程式一行結束 => Perfect!
    }
    
    public static void menu() {
        while(true) {
            System.out.println("Java Game");
            System.out.println("---------------");
            System.out.println("1. 猜數字");
            System.out.println("2. 猜英文字母");
            System.out.println("9. 離開");
            System.out.println("---------------");
            System.out.print("請選擇 ==> ");
            int choice = new Scanner(System.in).nextInt();
            switch(choice) {
                case 1:
                    numbergameloop();
                    break;
                case 2:
                    englishgameloop();
                    break;
                case 9:
                    return; // menu() 方法結束
            }
            System.out.println("請按下 Enter 鍵繼續...");
            new Scanner(System.in).nextLine(); 
        }
    }
    
    public static void englishgameloop() {
        English english = new English();
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("請輸入英文字母: ");
            int userAns = sc.next().toUpperCase().charAt(0); //
            int result = english.check(userAns);
            if (result == 0) {
                System.out.println("恭喜答對了!");
                break;
            } else {
                System.out.printf("猜第 %d 次, 結果: 猜 %s 了\n",
                        english.getCount(), result > 0 ? "大" : "小");
            }
        }
    }
    
    public static void numbergameloop() {
        Number number = new Number();
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("請輸入數字: ");
            int userAns = sc.nextInt();
            int result = number.check(userAns);
            if (result == 0) {
                System.out.println("恭喜答對了!");
                break;
            } else {
                System.out.printf("猜第 %d 次, 結果: 猜 %s 了\n",
                        number.getCount(), result > 0 ? "大" : "小");
            }
        }
    }
}
