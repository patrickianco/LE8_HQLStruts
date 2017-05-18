/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import java.io.Serializable;

/**
 *
 * @author Patrick Ian Co
 */
public class ConnectorAction extends ActionSupport implements Serializable {
    
    @Override
    public String execute(){
        return "success";
    }
}
