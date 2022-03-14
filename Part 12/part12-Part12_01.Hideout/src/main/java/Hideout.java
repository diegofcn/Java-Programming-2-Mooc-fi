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


public class Hideout<T> {
    private ArrayList<T> elements;
    
    public Hideout(){
        this.elements = new ArrayList<>();
    }
    
    public void putIntoHideout(T toHide){
        this.elements.add(toHide);
    }
    
    public T takeFromHideout(){
        for (int i = 0; i < elements.size(); i++) {
            T element = this.elements.get(i);
            this.elements.remove(i);
            return element;
        }
        
        return null;
    }
    
    public boolean isInHideout(){
        
        if (elements.isEmpty()) {
            return false;
        } else{
            return true;
        }
    }
}