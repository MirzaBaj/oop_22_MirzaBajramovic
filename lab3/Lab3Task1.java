/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lab3task1;

/**
 *
 * @author M
 */
public class Lab3Task1 {
    public static int sum(int number1,int number2, int number3, int number4){
        int sum=number1+number2+number3+number4;
        return sum;
               
    }
    public static double average(int number1, int number2, int number3,int number4){
        double avr=(double)sum(number1,number2,number3,number4)/4;
        return avr;
    }
    public static void main(String[] args) {
        double answer=average(4,3,6,1);
        System.out.println("average: "+answer);
    }
}
