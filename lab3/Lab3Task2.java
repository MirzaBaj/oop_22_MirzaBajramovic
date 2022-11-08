/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lab3task2;

/**
 *
 * @author M
 */
import java.util.Scanner;
public class Lab3Task2 {

    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        System.out.println("Type your name: ");
        String name=reader.nextLine();
        System.out.println("Number of characters: "+name.length());
    }
}
