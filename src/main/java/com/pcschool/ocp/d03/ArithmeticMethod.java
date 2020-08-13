package com.pcschool.ocp.d03;
import java.util.Random;

public class ArithmeticMethod {
    public static void main(String[] args) {      
        char[] poker = "A234567890JQK".toCharArray(); // 字串轉陣列
        // shuffle 洗牌
        for(int i=0;i<100;i++){
            Random r = new Random();
            int from = r.nextInt(poker.length);
            int to = r.nextInt(poker.length);
            char c = poker[from]; // 暫存 poker[from] 的資料在 c
            poker[from] = poker[to]; // poker[to] => poker [from]
            poker[to] = c; // c => poker[to] 
        }       
        // 列印
        for(char p : poker) {
            System.out.print(p + " ");
        }
        System.out.println();    
    }   
}
