/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab4task2;

/**
 *
 * @author M
 */

import java.util.Random;
    public class Dice{
    private Random random;
    private int numberOfSides; 
    
    public Dice(int numberOfSides){ //konstruktor
        this.numberOfSides=numberOfSides;
        random=new Random();
    }
    public int roll(){
          int number1=random.nextInt(this.numberOfSides)+1; // zbog nule +1
          return number1;
    }
}

