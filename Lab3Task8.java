/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lab3task8;

/**
 *
 * @author M
 */
import java.util.Scanner;
public class Lab3Task8 {
    public static boolean palindrom(String text){
        int duzina=text.length();
        String reverse="";
        int i;
        for(i=duzina-1;i>=0;i--){
            reverse+=text.charAt(i);
        }
        if(reverse.equals(text)) return true;
        else return false;
    }

    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        System.out.println("Type a text: ");
        String text=reader.nextLine();
        if(palindrom(text))
            System.out.println("The text is a palindrome.");
        else
             System.out.println("The text is not a palindrome");
    }
}
