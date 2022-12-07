/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lab6task4;
import java.util.Arrays;

/**
 *
 * @author Muti
 */
public class Lab6Task4 {

    public static void swap(int[] array, int index1,int index2){
        int pom=array[index1];
        array[index1]=array[index2];
        array[index2]=pom;
    }
    
    public static void main(String[] args) {
        int [] values={3,2,5,4,8};
        System.out.println(Arrays.toString(values));
        swap(values,1,0);
        System.out.println(Arrays.toString(values));
        
        swap(values,0,3);
        System.out.println(Arrays.toString(values));
                
    }
}
