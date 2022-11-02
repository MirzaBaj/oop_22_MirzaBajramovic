/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.task4;

/**
 *
 * @author M
 */
import java.util.Scanner;
public class Task4 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("First: ");
        int first=Integer.parseInt(reader.nextLine());
        System.out.println("Last: ");
        int last=Integer.parseInt(reader.nextLine());
        if(first<last){
            while(first<=last){
                System.out.println(first);
                first++;
            }
        }
        
    }
}
