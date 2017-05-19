package com;



import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.DAO;
import com.Users;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Angelica
 */
public class ViewUserAction extends ActionSupport implements ModelDriven<Users> {
    Users u = new Users();
    List<Users> listUsers = new ArrayList<Users>();
    DAO dao = new DAO();
   
    @Override
    public Users getModel() {
        return u;
    }
    public String direct(){
        listUsers = dao.getUser();
        return"success";
    }
    
    @Override
    public String execute(){
        listUsers = dao.getUser();
        return "success";
    }

    public Users getU() {
        return u;
    }

    public void setU(Users u) {
        this.u = u;
    }

    public List<Users> getListUsers() {
        return listUsers;
    }

    public void setListUsers(List<Users> listUsers) {
        this.listUsers = listUsers;
    }
    
    public String listUsers()
    {
        listUsers = dao.getUser();
        return "success";
    }

}

