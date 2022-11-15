/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab4task3;

/**
 *
 * @author M
 */
public class LyyraCard {
    private double balance;
    private String name;
    
    public LyyraCard(double balanceAtStart){
        this.balance=balanceAtStart;
    }
    public LyyraCard(double b, String name){
        this.balance=b;
        this.name=name;
    }
    public String toString(){   
        return this.name + "The card has "+this.balance+" euros.";
        
    }
    public void payEconomical(){
        if(this.balance-2.5>=0)
            this.balance-=2.5;       
        
    }
    public void payGourment(){
        if(this.balance-4>=0)
        this.balance-=4;
    }
    public void loadMoney(double amount){
        if(amount>0){
            this.balance+=amount;
            if(this.balance>150)
                this.balance=150;
        }
    }
    
}
