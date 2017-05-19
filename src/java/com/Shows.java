/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.io.Serializable;
import javax.persistence.Column;
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
    @Column(name = "ID")
    private Long show_id;
    
    private String title;
    private int show_year;
    private int show_season;
    
    public Shows(){
        
    }
    
    public Shows(String title, int show_year, int show_season){
        this.title = title;
        this.show_year = show_year;
        this.show_season = show_season;
    }

    public Long getShow_id() {
        return show_id;
    }

    public void setShow_id(Long show_id) {
        this.show_id = show_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getShow_year() {
        return show_year;
    }

    public void setShow_year(int show_year) {
        this.show_year = show_year;
    }

    public int getShow_season() {
        return show_season;
    }

    public void setShow_season(int show_season) {
        this.show_season = show_season;
    }
    
    
}
