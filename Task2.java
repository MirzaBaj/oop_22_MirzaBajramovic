/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.task2;

/**
 *
 * @author M
 */
import java.util.Scanner;
public class Task2 {

    public static void main(String[] args) {
       Scanner reader = new Scanner(System.in);
    int sum=0;
    int read;
    System.out.println("Type the first number: ");
    read=Integer.parseInt(reader.nextLine());
    sum+=read;
    
    System.out.println("Type the second number: ");
    read=Integer.parseInt(reader.nextLine());
    sum+=read;
    
    System.out.println("Type the third number: ");
    read=Integer.parseInt(reader.nextLine());
    sum+=read;
    
    System.out.println("Sum: "+sum);
    }
    
}
