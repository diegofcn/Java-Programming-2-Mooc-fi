/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brand
 */
public class Book implements Packable {

    private String author;
    private String nameOfBook;
    private double weightOfBook;

    public Book(String author, String name, double weight) {
        this.author = author;
        this.nameOfBook = name;
        this.weightOfBook = weight;
    }
    
    
    
    
    
    @Override
    public double weight() {
        return this.weightOfBook;
    }
    
    @Override
    public String toString(){
        return this.author + ": " + this.nameOfBook;
    }   
    
}
