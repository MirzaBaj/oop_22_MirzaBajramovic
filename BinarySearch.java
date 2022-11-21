/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab6task5;

/**
 *
 * @author M
 */
public class BinarySearch {
    public static boolean search(int [] array,int first,int last, int searchedValue){
       if(last>=first){
           int mid=first+(last-first)/2;
           if(array[mid]==searchedValue){
               return true;
           }
           if(array[mid]>searchedValue){
               return search(array,first,mid-1,searchedValue);
           }
           else{
               return search(array,mid+1,last,searchedValue);
           }
       }
       return false;
    }
    
}
