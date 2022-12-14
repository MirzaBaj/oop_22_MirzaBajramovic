/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab8task4;

/**
 *
 * @author M
 */
public class Purchase {
    private String product;
    private int amount; 
    private int unitPrice;
    
    public Purchase(String p, int a, int uP){
        this.product = p;
        this.amount = a;
        this.unitPrice = uP;
    }
    
    public int price(){
        return this.amount * this.unitPrice;
    }
    
    public void increaseAmount(){
        this.amount++; 
    }
    
    public String toString(){
        return this.product + ": " + this.amount;
    }
    
    
}
