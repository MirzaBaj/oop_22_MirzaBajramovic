/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lab5task2;

/**
 *
 * @author M
 */
public class Lab5Task2 {

    public static void main(String[] args) {
       Team barcelona= new Team("FC Barcelona");
        System.out.println("Team: "+barcelona.getName());
        
        Player brian= new Player("Brian");
        System.out.println("Player: "+brian);
        
        Player pekka= new Player("Pekka",39);
        System.out.println("Player: "+ pekka);
       
    }
}
