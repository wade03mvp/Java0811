package com.pcschool.ocp.d10.case6;

import java.util.Random;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) throws Exception{
        Vector<Integer> v = new Vector<>(25, 5); // 給定預設值和增加值
        for(int i=0;i<=26;i++){
            v.add(new Random().nextInt(100));                //容量大小     //存放個數
            System.out.printf("capacity: %d size: %02d %s\n", v.capacity(), v.size(), v);
            Thread.sleep(500);
        } 
    }
}
