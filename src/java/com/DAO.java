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
    List<Users> listUsers = new ArrayList<Users>();
    List<Shows> listShows = new ArrayList<Shows>();
    
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
         listUsers = (List<Users>) s.createQuery("from Users").list();
      }
      catch(Exception e)
      {
         e.printStackTrace();
      }
      return listUsers;
    }

    public List<Shows> getShows() {
        Session s = factory.openSession();
        Transaction t = s.beginTransaction();
      
      try
      {
         listShows = (List<Shows>) s.createQuery("from Shows").list();
      }
      catch(Exception e)
      {
         e.printStackTrace();
      }
      return listShows;
    }
    
    //User Functions
    
    public void addUser(Users u){
        Session s = factory.openSession();
        Transaction tx = s.beginTransaction();
        
        s.save(u);
        tx.commit();
        s.close();
    }
    
    //TV Show Functions
    
    public void addShow(Shows sh){
        Session s = factory.openSession();
        Transaction tx = s.beginTransaction();
        
        s.save(sh);
        tx.commit();
        s.close();
    }
    
    public boolean checkLogin(String name, String pass) {
        boolean status = false;
            Session s = factory.openSession();
           List results = s.createQuery("FROM Users").list();
            for(Iterator it = results.iterator(); it.hasNext();){
               Users user = (Users) it.next();
               if(user.getUsername().equals(name) && user.getPassword().equals(pass)){     
                   status = true;
            }else{
                   status = false;
               }
            }

        return status;
    }   
}
