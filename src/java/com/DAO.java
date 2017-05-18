/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.util.*;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
/**
 *
 * @author Patrick Ian Co
 */
public class DAO {
    List<Users> user = new ArrayList<Users>();
    List<Shows> shows = new ArrayList<Shows>();
    
    private static final SessionFactory factory;
    static {
        Configuration configuration = new Configuration();
        configuration.configure();
        ServiceRegistry serviceRegistry = 
                new StandardServiceRegistryBuilder().applySettings(
                        configuration.getProperties()).build();
        factory = configuration.buildSessionFactory(serviceRegistry);
    }
    
    public List<Users> getUser() {
      
      Session s = factory.openSession();
      Transaction t = s.beginTransaction();
      
      try
      {
         user = s.createQuery("from Users").list();
      }
      catch(Exception e)
      {
         e.printStackTrace();
      }
      return user;
    }
    
    public void addUser(Users u){
        Session s = factory.openSession();
        Transaction tx = s.beginTransaction();
        
        s.save(u);
        tx.commit();
        s.close();
    }
    public void addShow(Shows sh){
        Session s = factory.openSession();
        Transaction tx = s.beginTransaction();
        
        s.save(sh);
        tx.commit();
        s.close();
    }
}
