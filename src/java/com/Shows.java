/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Patrick Ian Co
 */
@Entity
public class Shows implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tv_id;
    
    private String title;
    private int tv_year;
    private int tv_season;
    
    public Shows(){
        
    }
    
    public Shows(String title, int tv_year, int tv_season){
        this.title = title;
        this.tv_year = tv_year;
        this.tv_season = tv_season;
    }
    
    public Long getId(){
        return tv_id;
    }
    
    public String getTitle(){
        return title;
    }
    
    public int getYear(){
        return tv_year;
    }
    
    public int getSeason(){
        return tv_season;
    }
    
    public void setTitle(String title){
        this.title = title;
    }
    
    public void setYear(int tv_year){
        this.tv_year = tv_year;
    }
    
    public void setSeason(int tv_season){
        this.tv_season = tv_season;
    }
}
