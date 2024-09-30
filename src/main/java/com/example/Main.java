package com.example;

import java.util.List;

import com.example.model.Student;
import com.example.service.StudentService;

public class Main {
    public static void main(String[] args) {
        StudentService ss = new StudentService();
        //Adding a student in database
        {
            Student student = new Student();
            student.setName("Waris");
            student.setEmail("waris@gmail.com");
            ss.addStudent(student);
        }

        //Retrieving student by id from database
        {
            Student student = ss.getStudentById(2);
            System.out.println(student);
        }

        //Fetch all the students from database and print it
        List<Student> students = ss.getAllStudents();
        for (Student student2 : students) {
            System.out.println(student2);
        }

        //Update a student in a database
        {
            Student student = new Student();
            student.setName("Aasif");
            student.setEmail("aasif@gmail.com");
            Student stud = ss.updateStudent(2, student);
            System.out.println(stud);
        }

        //delete a student by its id from database
        {
            int id = 5;
            ss.deleteStudent(id);
        }
    }
}