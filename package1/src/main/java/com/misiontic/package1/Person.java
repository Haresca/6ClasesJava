/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.misiontic.package1;

import java.util.Date;

/**
 *
 * @author Personal
 */
public class Person {
      
    public String name;
    public String lastName1;
    public String lastName2;
    public Date dateBirth;
    public float height;
    public float weight;
    
    public String getName(){
        return name;
    }

    public void setLastName1(String lastName1) {
        this.lastName1 = lastName1;
    }

    public void setLastName2(String lastName2) {
        this.lastName2 = lastName2;
    }

    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }

    public void setHeight(float height) {
        this.height = height;
    }
}
