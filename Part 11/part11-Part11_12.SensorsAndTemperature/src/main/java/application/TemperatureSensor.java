/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package application;

import java.util.Random;

/**
 *
 * @author brand
 */

public class TemperatureSensor implements Sensor{
    private boolean check = false;
    
    
    @Override
    public boolean isOn(){
        return this.check;
    }

    @Override
    public void setOn(){
        
        this.check = true;
    }
    
    @Override
    public void setOff(){
        this.check = false;
    }   
    
    @Override
    public int read(){
        if (isOn() == true) {
            int number = new Random().nextInt(61);
            
            if (number >=30) {
                number = number - 60;
            }
            
            return number; 
        } else {        
            throw new IllegalStateException();
        }
    }      
}