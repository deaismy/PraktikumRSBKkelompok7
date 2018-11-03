/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.session;

import java.text.DecimalFormat;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author vizyan
 */
@Stateless
@LocalBean
public class konversisuhu {
    
    DecimalFormat a = new DecimalFormat("0.0");
    String result;

    public String celcius_Fahrenheit(double param) {
//        String u = a.format(param*9.0/5.0 + 32);
        return result = a.format(((param*9.0/5.0 + 32)*100)/100.0);
    }

    public String celcius_Reamure(double param) {
        return result = a.format(((param)*4.0/5.0*100)/100.0);
    }

    public String reamure_Celcius(double param) {
        return result = a.format(((param)*5.0/4.0*100)/100.0);
    }

    public String reamure_Fahrenheit(double param) {
        return result = a.format(((param+32)*9.0/4.0*100)/100.0);
    }

    public String fahrenheit_Celcius(double param) {
        return result = a.format(((param-32)*5.0/9.0*100)/100.0);
    }

    public String fahrenheit_Reamure(double param) {
        return result = a.format(((param-32)*4.0/9.0*100)/100.0);
    }
    
}
