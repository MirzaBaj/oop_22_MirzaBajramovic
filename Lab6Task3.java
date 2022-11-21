/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lab6task3;

/**
 *
 * @author M
 */
public class Lab6Task3 {

   public static int indexOfSmallestStartingFrom(int [] array, int index){
         int smallest=array[index];
        int indexOfSmallest=index;
        for(int i=index+1;i<array.length;i++){
            if(smallest>array[i]){
                indexOfSmallest=i;
                smallest=array[i];
            }
        }
        return indexOfSmallest;
   }
    
    public static void main(String[] args) {
        int [] values={-1,6,9,8,12};
        System.out.println(indexOfSmallestStartingFrom(values,1));
        System.out.println(indexOfSmallestStartingFrom(values,2));
        System.out.println(indexOfSmallestStartingFrom(values,4));
    }
    
   
}
