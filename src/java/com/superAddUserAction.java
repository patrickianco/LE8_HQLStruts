/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.util.*;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import java.io.Serializable;
/**
 *
 * @author Patrick Ian Co
 */
public class superAddUserAction extends ActionSupport implements Serializable{
    private String username;
    private String password;
    private String role;
    DAO dao = new DAO();
    
    public String execute(){
        dao.addUser(new Users(username, password, role));
        return "success";
    }
    
    public String getUsername(){
        return username;
    }
    
    public void setUsername(String username){
        this.username = username;
    }
    
    public String getPassword(){
        return password;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    
    public String getRole(){
        return role;
    }
    
    public void setRole(String role){
        this.role = role;
    }
    
}
