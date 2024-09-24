package com.example.utilities;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static SessionFactory sessionFactory;

    static{
        try{ 
            Configuration con = new Configuration().configure("hibernate.cfg.xml");

            StandardServiceRegistry sr = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();

            sessionFactory = con.buildSessionFactory(sr);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }

    
}
