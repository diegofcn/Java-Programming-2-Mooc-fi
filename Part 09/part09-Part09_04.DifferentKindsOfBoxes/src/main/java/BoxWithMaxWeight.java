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

public class BoxWithMaxWeight extends Box{
    
    private int capacity;
    private ArrayList<Item> items;
    

    public BoxWithMaxWeight(int capacity){
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        if (capacity >= totalWeight() + item.getWeight()) {
            items.add(item);
        }
    }
    
    public int totalWeight(){
        int sum = 0;
        for (Item item: items) {
            sum+=item.getWeight();
        }
        return sum;
    }
    

    @Override
    public boolean isInBox(Item item) {
        if (items.contains(item)) {
            return true;
        } else{
            return false;
        }
    }
    



    
}