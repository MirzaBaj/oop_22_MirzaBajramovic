/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lab6task6;

/**
 *
 * @author M
 */
public class Lab6Task6 {
    public static void printElegantly(int[] array){
        for(int i=0;i<array.length;i++){
            if(i==array.length-1)
                System.out.print(array[i]);
            else 
            System.out.print(array[i]+", ");
        }
    }
    public static void main(String[] args) {
        int [] array={5,1,3,4,2};
        printElegantly(array);
    }
}
