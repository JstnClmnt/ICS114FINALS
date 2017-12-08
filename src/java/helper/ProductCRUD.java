/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import bean.*;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 *
 * @author Justine Clemente
 */
public class ProductCRUD {
        private static SessionFactory factory;

      public void init(){
        try{
             factory = new AnnotationConfiguration().
                       configure().
                       addPackage("bean"). //add package if used.
                       addAnnotatedClass(Products.class).
                       buildSessionFactory();
        } 
        catch (Throwable ex) { 
            System.err.println("Failed to create sessionFactory object." + ex);
            throw new ExceptionInInitializerError(ex); 
        }
    
    }
}