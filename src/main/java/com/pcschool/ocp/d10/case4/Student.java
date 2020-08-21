package com.pcschool.ocp.d10.case4;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Student implements Comparable<Student>{
    private String name;
    private Set<Exam> exams;

    public Student(String name) {
        this(name, new LinkedHashSet());
    }

    public Student(String name, Set<Exam> scores) {
        this.name = name;
        this.exams = scores;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Exam> getExams() {
        return exams;
    }

    public Student addScore(int score) {
        Exam exam = new Exam(score);
        exams.add(exam);
        return this;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.name);
        hash = 89 * hash + Objects.hashCode(this.exams);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Student other = (Student) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.exams, other.exams)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", scores=" + exams + '}';
    }

    @Override
    public int compareTo(Student other) {
        double avg       =  this.exams.stream().mapToInt(e -> e.getScore()).average().getAsDouble();
        double avg_other = other.exams.stream().mapToInt(e -> e.getScore()).average().getAsDouble();
        return (int)(avg_other - avg);
    }
    
}
