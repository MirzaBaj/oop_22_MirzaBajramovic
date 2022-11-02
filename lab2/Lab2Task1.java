/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lab2task1;

/**
 *
 * @author M
 */
import java.util.Scanner;

public class Lab2Task1 {

    public static void main(String[] args) {        
        Scanner reader = new Scanner(System.in);
        
        while(true){
        System.out.println("Type the password: ");
        String password=reader.nextLine();
        if(password.equals("carrot")){
            System.out.println("Right!");
            break;
            }
        else{
            System.out.println("Wrong!");
        }
        } 
        System.out.println("The secret is: jryy qbar");       
    }
}
