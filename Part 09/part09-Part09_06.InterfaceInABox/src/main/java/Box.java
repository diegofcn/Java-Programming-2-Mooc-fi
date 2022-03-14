/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brand
 */

import java.util.ArrayList;

public class Box implements Packable{
    
    private double maxCap;
    private ArrayList<Packable> packables;
    
    
    
    public Box(double maxCap){
        this.maxCap = maxCap;
        this.packables = new ArrayList<>();
    }
    
    public double weight(){
        double currentWeight = 0;
        for (Packable box: packables) {            
                currentWeight = currentWeight + box.weight();
        }
        return currentWeight;
    }

    public void add(Packable packable){
        if (this.maxCap >= packable.weight() + weight()) {
            this.packables.add(packable);            
        }
    }
    
    @Override
    public String toString(){
        return "Box: " + this.packables.size() + " items, total weight " +
                weight() + " kg";
    }

}
