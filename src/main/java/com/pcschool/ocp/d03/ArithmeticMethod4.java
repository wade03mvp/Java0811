package com.pcschool.ocp.d03;

import java.util.Arrays;
import java.util.Comparator;

public class ArithmeticMethod4 { 
    public static void main(String[] args) {
        Exam[] exams = {
            new Exam(100),
            new Exam(50),
            new Exam(80),
            new Exam(90),
            new Exam(40),
        };
        // 利用 Java8 列出及格分數且由大到小排序
        Arrays.stream(exams)
                .filter(e -> e.getScore() >= 60) // 及格分數
                .sorted(Comparator.comparing(Exam::getScore).reversed()) // 由大到小 .reversed()
                .forEach(e -> System.out.println(e));
    }
}

class Exam {
    private int score;

    public Exam(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Exam{" + "score=" + score + '}';
    }
    
}
