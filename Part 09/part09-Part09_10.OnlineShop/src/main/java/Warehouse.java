
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brand
 */
public class Warehouse {
    
    private Map<String, Integer> prices;
    private Map<String, Integer> stocks;
    

    public Warehouse() {
        this.prices = new HashMap<>();
        this.stocks = new HashMap<>();
    }
    
    public void addProduct(String product, int price, int stock) {
        this.prices.put(product, price);
        this.stocks.put(product, stock);
        
    }
    
    public int price(String product) {
        return prices.getOrDefault(product, -99);
        
    }
    
    public int stock(String product) {
        return stocks.getOrDefault(product, 0);
    }
    
    public boolean take(String product) {
        if(stock(product) !=0) {
            stocks.replace(product, stocks.get(product) - 1);
            return true;
            
        } else {
            return false;
        }
    }
    public Set<String> products(){
        Set<String> products = stocks.keySet();
        return products;
    }
    
}
