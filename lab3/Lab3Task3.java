/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lab3task3;

/**
 *
 * @author M
 */
import java.util.Scanner;
public class Lab3Task3 {

    public static void main(String[] args) {
        Scanner reader= new Scanner(System.in);
        System.out.println("Type your name: ");
        String name=reader.nextLine();
        int i=0;
        
        for(i=0;i<name.length();i++){
            char character=name.charAt(i);
            System.out.println(i+1+". character: "+character);
        }
    }
}
