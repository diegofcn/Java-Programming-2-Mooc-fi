/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brand
 */
public class CD implements Packable{

    private String artist;
    private String nameOfCD;
    private int publication;
    final double weightOfCD;

    public CD(String artist, String name, int publication) {
        this.artist = artist;
        this.nameOfCD = name;
        this.publication = publication;
        this.weightOfCD = 0.1;
    }
    
    
    
    @Override
    public double weight() {
        return this.weightOfCD;
    }
    
    
    @Override
    public String toString(){
        return this.artist + ": " + this.nameOfCD + " (" + 
               this.publication + ")";
}
}