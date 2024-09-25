package com.example;

import java.util.List;

import com.example.model.Student;
import com.example.service.StudentService;

public class Main {
    public static void main(String[] args) {
        StudentService ss = new StudentService();

        // Student stu = new Student();
        // stu.setName("Jamid");
        // stu.setEmail("jamid@gmail.com");

        // ss.addStudent(stu);

        Student student = ss.getStudentById(1);
        System.out.println(student);

        List<Student> students = ss.getAllStudents();
        for (Student student2 : students) {
            System.out.println(student2);
        }

        Student studen = new Student();
        studen.setName("Akieb");
        studen.setEmail("akieb@gmail.com");
        Student stud = ss.updateStudent(1, studen);
        System.out.println(stud);

    }
}