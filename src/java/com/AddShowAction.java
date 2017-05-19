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
public class AddShowAction extends ActionSupport implements Serializable{
    private String title;
    private int year;
    private int season;
    DAO dao = new DAO();
    
    public String execute(){
        dao.addShow(new Shows(title, year, season));
        return "success";
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSeason() {
        return season;
    }

    public void setSeason(int season) {
        this.season = season;
    }
    
    
}
