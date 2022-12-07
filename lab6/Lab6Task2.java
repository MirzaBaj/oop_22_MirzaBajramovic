/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lab6task2;

/**
 *
 * @author M
 */
public class Lab6Task2 {
  public static int indexOfSmallest(int [] array){
        int smallest=array[0];
        int indexOfSmallest=-1;
        for(int i=1;i<array.length;i++){
            if(smallest>array[i]){
                indexOfSmallest=i;
            }
        }
        return indexOfSmallest;
    }
    public static void main(String[] args) {
        int [] values={6,5,8,7,11};
         System.out.println("Index of smallest: "+ indexOfSmallest(values));
    }
    
}
