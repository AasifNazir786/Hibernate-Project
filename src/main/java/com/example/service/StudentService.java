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
            return session.get(Student.class, id);
        }
    }

   
    public List<Student> getAllStudents() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Student> students = session.createQuery("from students", Student.class).list();
        session.close();
        return students;
    }

    
    public Student updateStudent(int id, Student stu) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateStudent'");
    }
}
