package com.pcschool.ocp.d02;

public class StringTest {
    public static void main(String[] args) {
        String s1 = new String("Java");
        String s2 = new String("Java");
        String s3 = new String("JAVA");
        System.out.println(s1 == s2); // 比較字串存放位置
        System.out.println(s1.equals(s2)); // 比較字串的內容
        System.out.println(s1.equals(s3)); 
        System.out.println(s1.equalsIgnoreCase(s3)); // 比較字串的內容,忽略大小寫
    }    
}
