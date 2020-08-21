package com.pcschool.ocp.d10.case4;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class School2 {
    public static void main(String[] args) {
        Student s1 = new Student("John");
        s1.addScore(80).addScore(90).addScore(90).addScore(70);
        
        Set<Exam> scores = new LinkedHashSet<>();
        scores.add(new Exam(90));
        scores.add(new Exam(80));
        scores.add(new Exam(70));
        scores.add(new Exam(100));
        Student s2 = new Student("Mary", scores);
        
        System.out.println(s1);
        System.out.println(s2);
        
        // 全班
        Set<Student> students = new LinkedHashSet<>();
        students.add(s1);
        students.add(s2);
        System.out.println(students);
        System.out.println("-------------------------");
        
        // 全班 (平均由大到小排列)
        Set<Student> students2 = new TreeSet<>();
        students2.add(s1);
        students2.add(s2);
        System.out.println(students2);
    }
}
