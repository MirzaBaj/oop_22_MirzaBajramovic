/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lab6task5;
import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author M
 */
public class Lab6Task5 {

    public static void main(String[] args) {
        int array[]={-3,2,3,4,7,8,12};
        Scanner reader=new Scanner(System.in);
        System.out.print("Values of the array: "+Arrays.toString(array));
        System.out.println("");
        
        System.out.print("Enter searched numbers: ");
        String searchedValue=reader.nextLine();
        System.out.println("");
        
        boolean result=BinarySearch.search(array, 0,array.length,Integer.parseInt(searchedValue));
        
        if(result==false){
            System.out.println("Value: "+searchedValue+" is not in the array");
        }
        else {
            System.out.println("Value: "+searchedValue+" is in the array");
        }
        
        
    }
}
