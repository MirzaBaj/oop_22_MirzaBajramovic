/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab8task2;

/**
 *
 * @author M
 */
public class CD implements ToBeStored {
    private String artist,title;
    private int year;
    private double weight;
    public CD(String artist, String title, int year){
        this.artist=artist; 
        this.title=title;
        this.year=year;
        this.weight=0.1;
    }
    @Override
    public double weight(){
        return this.weight;
    }
    public String toString(){
        return this.artist + ": " + this.title + " (" + this.year + ")";
    }
}
