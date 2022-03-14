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
import java.util.Collections;

public class ChangeHistory {
    
    private ArrayList<Double> changes;
    
    public ChangeHistory(){
        this.changes = new ArrayList<>();
    }
    
    public void add(double status) {
        this.changes.add(status);
    }
    public void clear(){
        this.changes.removeAll(changes);
    }
    
    public String toString(){
        return "" + this.changes;
    }
    
    public double maxValue(){
        if(this.changes.isEmpty()) {
            return 0.0;
        }
        return 1.0 * Collections.max(changes);
        
    }
    public double minValue(){
        if(this.changes.isEmpty()) {
            return 0.0;
        }
        return 1.0 * Collections.min(changes);
    
    }
        
    public double average(){
        if(this.changes.isEmpty()) {
            return 0;
        }
        int sum = 0;
        for(double i: changes) {
            sum+=i;
        }
        return 1.0 * sum / changes.size();
    }
    
}
