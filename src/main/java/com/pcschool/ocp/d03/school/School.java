package com.pcschool.ocp.d03.school;

public class School {
    public static void main(String[] args) {
        String[][] data = {
            {"john", "18", "170", "60"}, 
            {"mary", "17", "160", "45"}, 
            {"jane", "17", "165", "65"}, 
            {"mark", "19", "180", "55"},  
          // row[0] row[1] row[2] row[3]       
        };
        
        Student[] students = new Student[data.length]; // 建立新陣列存放
        for(int i=0;i<data.length;i++) { // 利用迴圈 個別抓資料
            String[] row = data[i];
            String name   = row[0];
            int age       = Integer.parseInt(row[1]);
            double height = Double.parseDouble(row[2]);
            double weight = Double.parseDouble(row[3]);
            // 建立 BMI 物件
            BMI bmi = new BMI(height, weight);
            // 建立 Student 物件
            Student student = new Student(name, age, bmi);
            // 放入資料
            students[i] = student;
        }
        // 印出 students
        for(Student student : students){
            System.out.println(student);
        }
        System.out.println("----------------------------------");
        
        for(int i=0;i<students.length;i++){
            Student s1 = students[i];
            Student s2 = students[i+1];
        }
    }   
}
