package com.example.service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.example.model.Student;
import com.example.utilities.HibernateUtil;

public class StudentService{
    
    public void addStudent(Student student){
        Transaction transaction = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.persist(student);
            transaction.commit();
        } catch (Exception e) {
            if(transaction != null){
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    
    public Student getStudentById(int id) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Student stu = session.get(Student.class, id);
            session.close();
            return stu;
        }
    }

   
    public List<Student> getAllStudents() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Student> students = session.createQuery("from Student", Student.class).list();
        session.close();
        return students;
    }

    
    @SuppressWarnings("deprecation")
    public Student updateStudent(int id, Student stu) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        Student existingStudent = null;
    
        try {
            transaction = session.beginTransaction();
            existingStudent = session.get(Student.class, id);
            if (existingStudent != null) {
                existingStudent.setName(stu.getName());
                existingStudent.setEmail(stu.getEmail());
                session.update(existingStudent);
            } else {
                System.out.println("Student with ID " + id + " not found.");
            }
    
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
    
        return existingStudent;
    }
}
