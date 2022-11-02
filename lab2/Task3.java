/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.task3;

/**
 *
 * @author M
 */
import java.util.Scanner;
public class Task3 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum=0;
        while(true){
            System.out.println("Type the number: ");
            int read=Integer.parseInt(reader.nextLine());
            if(read==0) break;
            sum+=read;
            System.out.println("Sum now: "+sum);
        }
        System.out.println("Sum at the end: "+sum);
    }
}
