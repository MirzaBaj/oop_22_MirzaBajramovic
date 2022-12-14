/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab8task2;

/**
 *
 * @author M
 */
public class Book implements ToBeStored{
    private String writer,name;
    Double weight;
    
    public Book(String writer,String name,Double weight){
     this.writer=writer;
     this.name=name;
     this.weight=weight;
    }
    @Override
    public double weight(){
        return this.weight;
    }
    public String toString(){
        return this.writer+": "+this.name;
    }
}
