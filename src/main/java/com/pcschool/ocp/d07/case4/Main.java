package com.pcschool.ocp.d07.case4;

import com.google.gson.Gson;
import java.io.File;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception { // 拋出例外
        // 取得 JSON 字串
        String path = "src\\main\\java\\com\\pcschool\\ocp\\d07\\case4\\programmer.json";
        String json = new Scanner(new File(path)).useDelimiter("\\A").next(); // 取得所有字串
        //System.out.println(json);
        // 透過 Gson 將 json 資料匯入到 Programmer[] 陣列中
        Programmer[] programmers = new Gson().fromJson(json, Programmer[].class);
        // 有幾筆資料 ?
        System.out.printf("資料筆數: %d\n", programmers.length);
        
        // 請問所有 Programmer 總薪資? 平均薪資? 最高? 最低?        
        IntSummaryStatistics stat = Arrays.stream(programmers)
                .mapToInt(p -> p.getSalary())
                .summaryStatistics(); // 取得所有陣列的統計資料
        System.out.printf("總薪資: %,d 平均: %,.1f 最高: %,d 最低 %,d\n",
                stat.getSum(), stat.getAverage(), stat.getMax(), stat.getMin());
        // Java 平均? php 平均? 男 平均? 女 平均?
        double javaAvg = Arrays.stream(programmers)
                .filter(p -> p.getName().equals("java"))
                .mapToInt(p -> p.getSalary())
                .summaryStatistics().getAverage(); // 取得陣列中 java 的統計資料
        System.out.printf("java平均薪資: %,.1f\n", javaAvg);
        
        double phpAvg = Arrays.stream(programmers)
                .filter(p -> p.getName().equals("php"))
                .mapToInt(p -> p.getSalary())
                .summaryStatistics().getAverage(); 
        System.out.printf("php平均薪資: %,.1f\n", phpAvg);
        
        double mAvg = Arrays.stream(programmers)
                .filter(p -> p.getSex().equals("m"))
                .mapToInt(p -> p.getSalary())
                .summaryStatistics().getAverage(); 
        System.out.printf("男性平均薪資: %,.1f\n", mAvg);
        
        double fAvg = Arrays.stream(programmers)
                .filter(p -> p.getSex().equals("f"))
                .mapToInt(p -> p.getSalary())
                .summaryStatistics().getAverage(); 
        System.out.printf("女性平均薪資: %,.1f\n", fAvg);
    }  
}
