/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.task7;

/**
 *
 * @author M
 */
public class Task7 {
    
    private static void printStars(int amount){
        while(amount>0){
            System.out.print("*");
            amount--;
        }
        System.out.print("\n");
    }

    public static void main(String[] args) {
        printStars(5);
        printStars(3);
        printStars(9);
    }
}
