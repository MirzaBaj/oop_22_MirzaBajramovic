/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lab3task5;

/**
 *
 * @author M
 */
import java.util.Scanner;

public class Lab3Task5 {

    public static void main(String[] args) {
         Scanner reader= new Scanner(System.in);
        
        System.out.println("Type the first word: ");
        String first=reader.nextLine();
          System.out.println("Type the second word: ");
        String second=reader.nextLine();
        if(first.indexOf(second)==-1){
                    System.out.println("The word '"+second+"' is not found in the word '"+first+"'");

        }
        else{
            System.out.println("The word '"+second+"' is found in the word '"+first+"'");
        }
    }
}
