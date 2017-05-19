/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Patrick Ian Co
 */
public class ViewShowAction {
    Shows sh = new Shows();
    List<Shows> listShows = new ArrayList<Shows>();
    DAO dao = new DAO();
    
    public String execute(){
        listShows = dao.getShows();
        return "success";
    }

    public Shows getSh() {
        return sh;
    }

    public void setSh(Shows sh) {
        this.sh = sh;
    }

    public List<Shows> getListShows() {
        return listShows;
    }

    public void setListShows(List<Shows> listShows) {
        this.listShows = listShows;
    }
    
    
}
