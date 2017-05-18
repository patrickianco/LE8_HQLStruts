/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import com.opensymphony.xwork2.ActionSupport;
import java.io.Serializable;

/**
 *
 * @author Patrick Ian Co
 */
public class LoginAction extends ActionSupport implements Serializable{
    private String username;
    private String password;
    
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
    
    @Override
    public String execute(){
        return "success";
    }
    
    @Override
    public void validate(){
        if(!"admin".equals(username)){
            addFieldError(username, "Please enter the correct username");
        }
        if(!password.equals("admin")){
            addFieldError(password, "Please enter the correct username");
        }
    }
}
