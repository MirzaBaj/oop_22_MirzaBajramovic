/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lab7task2;

/**
 *
 * @author M
 */
public class Lab7task2 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
     PromissoryNote mattisNote = new PromissoryNote();
    mattisNote.setLoan("Arto", 51.5);
     mattisNote.setLoan("Mikael", 30);
 
    System.out.println(mattisNote.howMuchIsDebt("Arto"));
     System.out.println(mattisNote.howMuchIsDebt("Joel"));
    }
}
