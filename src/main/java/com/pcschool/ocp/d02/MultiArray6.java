package com.pcschool.ocp.d02;

public class MultiArray6 {
    public static void main(String[] args) {
        int[] scores = {100, 90 ,80};
        for(int i=0;i<scores.length;i++) {
            System.out.print(scores[i] + " ");
        }
        System.out.println();
        for(int x : scores){ // for-each 找資料快,但沒辦法修改
            System.out.print(x + " ");    
        }
        System.out.println();
    }    
}
