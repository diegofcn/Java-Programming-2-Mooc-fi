/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brand
 */
import java.util.HashMap;
import java.util.Map;


public class ShoppingCart {
    private Map<String, Item> items;
    
    public ShoppingCart(){
        this.items = new HashMap<>();

    }
    
    public void add(String product, int price){

        
        if (items.containsKey(product)) {
            items.get(product).increaseQuantity();
            this.items.replace(product, new Item(product, items.get(product).qty(), price));
        } else {
            this.items.put(product, new Item(product, 1, price));
            }
    }
    
    public int price(){
        
        int sum = 0;
        for (Item item: items.values()) {
            sum += item.price();
        }
        return sum;
    }
    
    public void print(){
        for (Item item: items.values()) {
            System.out.println(item.toString());;
        }       
    }
}