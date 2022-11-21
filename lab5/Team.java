/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab5task5;

import java.util.ArrayList;

/**
 *
 * @author M
 */
public class Team {
       private ArrayList<Player> players= new ArrayList<Player>();
    private String name;
    private int maxSize=16;
    
    public Team(String teamName){
        this.name=teamName;
    }
    
    public String getName(){
        return this.name;
    }
    public void addPlayers(Player player){
        if(this.players.size()<this.maxSize)
            this.players.add(player);
    }
    public void printPlayers(){
         for(Player player: this.players){
             System.out.println(player.getName()+" goals: "+player.getGoals());
         }
    }
    
    public void setMaxSize(int newMaxSize){
        this.maxSize=newMaxSize;
    }
    public int size(){
        return this.players.size();
    }
    public int goals(){
        int totalGoals=0;
        for(Player player : this.players){
            totalGoals=totalGoals+player.getGoals();
        }
        return totalGoals;
    }
    
}
