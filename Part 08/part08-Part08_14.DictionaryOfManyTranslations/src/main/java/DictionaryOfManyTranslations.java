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
import java.util.ArrayList;

public class DictionaryOfManyTranslations {
    
private HashMap<String, ArrayList<String>> mTranslations;
    
    
    public DictionaryOfManyTranslations() {
        this.mTranslations = new HashMap<>();
        
    }
    
    public void add(String word, String translation) {
        this.mTranslations.putIfAbsent(word, new ArrayList<>());
        this.mTranslations.get(word).add(translation);
    }
    
    public ArrayList<String> translate(String word) {
        return this.mTranslations.getOrDefault(word, new ArrayList<>());
       
        
    }
    public void remove(String word) {
        this.mTranslations.remove(word);
        
    }
    
    
}
