/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.task5;

/**
 *
 * @author M
 */
import java.util.Scanner;
public class Task5 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a number: ");
        int n=Integer.parseInt(reader.nextLine());
        int sum=0;
        while(n>=0){
            int result=(int)Math.pow(2,n);        
            n--;
            sum+=result;
        }
        
        System.out.println("The result is: "+sum);
    }
}
