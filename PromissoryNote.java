/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab7task2;
import java.util.HashMap;
/**
 *
 * @author M
 */
public class PromissoryNote {
            private HashMap<String, Double> loans;

    public PromissoryNote(){
        loans=new HashMap<String,Double>();
    }
    
    public void setLoan(String toWhom, double value){
        loans.put(toWhom,value);
    }
    
    public double howMuchIsDebt(String whose){
        if(loans.containsKey(whose))
               return loans.get(whose);
        return 0;
        
    }
    
}
