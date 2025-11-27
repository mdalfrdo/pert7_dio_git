/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pert4_51422015.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;     

/**
 *
 * @author DIO
 */
public class HibernateUtil {
    private static SessionFactory sessionFactory;
    
    static {
        try {   
            sessionFactory = new Configuration().configure().buildSessionFactory();
        } catch (Throwable e) {
            System.out.println("Initial SessionFactory creation failed.");
            throw new ExceptionInInitializerError(e);
        }
    }
    
    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }
    
    public static void testConnection(){
        try (Session session = sessionFactory.openSession()){
            System.out.println("Connection to the database was successful.");
        } catch (Exception e){
            System.out.println("Failed connect to database.");
            e.printStackTrace();
        }
    }
}
