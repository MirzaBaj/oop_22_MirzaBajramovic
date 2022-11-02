/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.task6;

/**
 *
 * @author M
 */
import java.util.Scanner;
public class Task6 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("How many times the text should be printed?");
        int n=Integer.parseInt(reader.nextLine());
        while(n>0){
            printText();
            n--;
        }
    }
    
    public static void printText(){
        System.out.println("In the beginning there were the swamp, the hoe and Java.");
    }
}
