package com.example;

import com.example.model.Student;
import com.example.service.StudentService;

public class Main {
    public static void main(String[] args) {
        StudentService ss = new StudentService();

        Student stu = new Student();
        stu.setName("Jamid");
        stu.setEmail("jamid@gmail.com");

        ss.addStudent(stu);
    }
}