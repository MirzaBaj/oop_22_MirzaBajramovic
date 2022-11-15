/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lab5task5;

/**
 *
 * @author M
 */
public class Lab5Task5 {

    public static void main(String[] args) {
        
        Team barcelona= new Team("FC Barcelona");
        Player brian= new Player("Brian");
        Player pekka= new Player("Pekka",39);
        barcelona.addPlayers(brian);
        barcelona.addPlayers(pekka);
        barcelona.addPlayers(new Player("Mikael",1));
        
        System.out.println("Total goals: "+barcelona.goals());
    }
}
