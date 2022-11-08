/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lab4task2;

/**
 *
 * @author M
 */

public class Lab4Task2 {

    public static void main(String[] args) {
        Dice dice= new Dice(6);
        
        int i=0;
        while(i<10){
             System.out.println(dice.roll());
             i++;
        }
       
    }
}
