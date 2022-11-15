/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab5task5;

/**
 *
 * @author M
 */
public class Player {
        private String name;
    private int number;
    
   
    public Player(String playersName){
        this.name=playersName;
    }
    public Player(String playersName, int goals){
        this.name=playersName;
        this.number=goals;
    }
    public String getName(){
        return this.name;
    }
    public  int getGoals(){
        return this.number;
    }
    public String toString(){
        return this.name+", goals:"+this.number;
    }
    
}
