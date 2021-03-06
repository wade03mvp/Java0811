package com.pcschool.ocp.d09.case8;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.DoubleUnaryOperator;
import java.util.function.Function;
import java.util.function.ObjIntConsumer;
import java.util.function.UnaryOperator;

public class BMIOperator {
    public static void main(String[] args) {
        BiConsumer<Double, Integer> bc = (h, w) -> System.out.println(w / Math.pow(h/100, 2));
        bc.accept(170.0, 60);
        
        BiFunction<Double, Integer, Double> bf = (h, w) -> w / Math.pow(h/100, 2);
        BiFunction<Double, Integer, Double> bf2 = (h, w) -> h * w;
        double bmi = bf.apply(170.0, 60);
        System.out.println(bmi);
        
        BiFunction<Double, Double, Double> bf3 = (h, w) -> w / Math.pow(h/100, 2);
        System.out.println(bf3.apply(170.0, 60.0));
        
        BinaryOperator<Double> bo = (h, w) -> w / Math.pow(h/100, 2); // BiFunction<Double, Double, Double>
        System.out.println(bo.apply(170.0, 60.0));
        
        // 攝氏轉華氏
        Function<Double, Double> f1 = (c) -> c * (9.0/5) + 32; 
        UnaryOperator<Double>    uo = (c) -> c * (9.0/5) + 32; // Function<Double, Double>
        DoubleUnaryOperator      du = (c) -> c * (9.0/5) + 32; // UnaryOperator<Double>
        
        System.out.println(f1.apply(0.0));
        System.out.println(uo.apply(0.0));
        System.out.println(du.applyAsDouble(0.0));
        
        // ObjIntConsumer 用法
        class Exam {     // 內部類別
            int chinese;
            int english;
        }
        Exam exam = new Exam();
        exam.chinese = 100;
        exam.english = 80;
        
        ObjIntConsumer<Exam> ois = (e, value) -> {System.out.println((e.chinese + e.english)/2 >= value);};
        ois.accept(exam, 60);
    }
}
