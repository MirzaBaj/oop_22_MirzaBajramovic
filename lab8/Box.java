/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab8task2;

/**
 *
 * @author M
 */
public class Box {
    private double maxweight,currentweight;
    private int numberOfThings;
    
    public Box(double maxweight){
        this.maxweight=maxweight;
        this.currentweight=0;
        this.numberOfThings=0;
    }
    
    public void add(ToBeStored object){
        if((this.currentweight+object.weight())<=this.maxweight){
            this.currentweight+=object.weight();
            this.numberOfThings++;
        }
    }
    
    public String toString(){
        return "Box: "+numberOfThings +" things, total weight "+this.currentweight;
    }
}
