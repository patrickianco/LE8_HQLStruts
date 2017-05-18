/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import java.util.*;
import javax.xml.registry.infomodel.User;

/**
 *
 * @author Patrick Ian Co
 */
public class SelectAction extends ActionSupport{
//    Users user = new Users();
//    List<User> users = new ArrayList<User>(); 
    DAO dao = new DAO();
    private List<String> roles;
    private String role;
    
    public SelectAction(){
        roles = new ArrayList<String>();
        roles.add("Admin");
        roles.add("User");
    }
    
    public String getRole(){
        return role;
    }
    
    public void setRole(String role){
        this.role = role;
    }
    
    public List<String> getRoles(){
        return roles;
    }
    
    public void setAttribute(List<String> roles){
        this.roles = roles;
    }
    
    public String select(){
        return "success";
    }
}
