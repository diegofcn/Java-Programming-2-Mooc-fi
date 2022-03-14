/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;


import java.io.File;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author brand
 */
public class SaveableDictionary {
    
private ArrayList<String[]> dictionary;
    private File file;

    public SaveableDictionary() {
        this.dictionary = new ArrayList<>();
    }

    public SaveableDictionary(String file) {
        this.dictionary = new ArrayList<>();
        this.file = new File(file);
    }

    public boolean load() {
        try {
            Scanner fileReader = new Scanner(Paths.get(this.file.getName())); 
            
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] parts = line.split(":");
                this.add(parts[0], parts[1]); 
            }
            return true; 
            
        } catch (Exception e) {
            System.out.println("File load error: " + e.getMessage());
            return false;
        }
    }

    public boolean save() {
        try {

            PrintWriter pw = new PrintWriter(this.file.getName());
            for (String[] str: this.dictionary) {

                String word = str[0];
                String translation = str[1];
                pw.println(word + ":" + translation);
            }
            pw.close();
            
            return true;
            
        } catch (Exception e) {

            System.out.println(e.getMessage());
            return false;
        }

    }

    public void add(String words, String translation) {
        String[] wordPair = new String[2];
        wordPair[0] = words; 
        wordPair[1] = translation;
        this.dictionary.add(wordPair); 
    }

    public String translate(String word) {
        for (String[] str: this.dictionary) {
            if (str[0].equals(word)) {
                return str[1];
            }
            if (str[1].equals(word)) {
                return str[0];
            }
        }
        return null;
    }

    public void delete(String word) {
        for (int i = 0; i < this.dictionary.size(); i++) {
            if (this.dictionary.get(i)[0].equals(word) || this.dictionary.get(i)[1].equals(word)) {
                this.dictionary.remove(i);
            }
        }
    }

}