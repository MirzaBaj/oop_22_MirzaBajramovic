    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lab4task3;

/**
 *
 * @author M
 */
public class Lab4Task3 {

    public static void main(String[] args) {
        
        //PART1
        //LyyraCard card=new LyyraCard(10);
        //System.out.println(card); //poziva toString metodu.
        
        //PART2
        /* 
        card.payEconomical();
        System.out.println(card);
        
        card.payGourment();
        card.payEconomical();
        System.out.println(card);
        */
       
       //PART3
       /*
       card.payGourment();
        System.out.println(card);
        
        card.payGourment();
        System.out.println(card);
      */
       
       //PART4
       /*
       card.loadMoney(15);
       System.out.println(card);
       
       card.loadMoney(10);
        System.out.println(card);
       
        card.loadMoney(200);
        System.out.println(card);
        */
       
        //PART 5
        /*
        System.out.println("Pekka: "+card);
        card.loadMoney(-15);
        System.out.println("Pekka: "+ card);
        */
        
        //PART 6
        LyyraCard pekka= new LyyraCard(20,"Pekka");
        LyyraCard brian=new LyyraCard(30,"Brian");
        
        pekka.payGourment();
        brian.payEconomical();
        System.out.println(pekka);
        System.out.println(brian);
        
        pekka.loadMoney(20);
        brian.payGourment();
        
        System.out.println(pekka);
        System.out.println(brian);
        
        pekka.payEconomical();
        pekka.payEconomical();
        brian.loadMoney(50);
        
        System.out.println(pekka);
        System.out.println(brian);
    }
}
