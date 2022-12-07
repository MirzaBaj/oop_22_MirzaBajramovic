/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lab6task1;

/**
 *
 * @author M
 */
public class Lab6Task1 {
  public static int smallest(int [] array){        
        int smallest=array[0];
        for(int i=1;i<array.length;i++){
            if(array[i]<smallest)
                smallest=array[i];
        }        
        return smallest;
    }
    public static void main(String[] args) {
        int [] values={6,5,8,7,11};
        System.out.println("smallest: "+smallest(values));
    }
}
