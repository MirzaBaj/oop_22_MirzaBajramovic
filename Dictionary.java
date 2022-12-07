/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab7task3;
import java.util.HashMap;
import java.util.ArrayList;
/**
 *
 * @author M
 */
public class Dictionary {
    private HashMap<String,String> dictionary;
    
    public Dictionary(){
    dictionary=new HashMap<String,String>();
}
    
    public String translate(String word){
        if(dictionary.containsKey(word))
            return dictionary.get(word);
        return null;
    }
    
    public void add(String word, String transaltion){
        dictionary.put(word,transaltion);
    }
    
    public int amountOfWords(){
        return dictionary.size();
    }
    
    public ArrayList<String> translationList(){
        ArrayList<String> translateList= new ArrayList<String>();
        for(String key: dictionary.keySet()){
            translateList.add(key+" = "+dictionary.get(key));
        }
    return translateList;

    }
    
}
