package com.example.utilities;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.example.model.Student;

public class HibernateUtil
{
    private static SessionFactory sessionFactory;

    static
    {
        try
        {
            Configuration con = new Configuration().configure().addAnnotatedClass(Student.class);

            StandardServiceRegistry sr = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();

            sessionFactory = con.buildSessionFactory(sr);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static SessionFactory getSessionFactory()
    {
        return sessionFactory;
    }

    
}
