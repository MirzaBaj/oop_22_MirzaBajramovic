/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lab4task1;
import java.util.ArrayList;


/**
 *
 * @author M
 */
public class Lab4Task1 {
    public static void combine (ArrayList<Integer> first, ArrayList<Integer> second){
    //first.add(1);
    
    first.addAll(second);
    
    }
    public static void main(String[] args) {
        System.out.println("Hello World!");
        ArrayList<Integer> list1=new ArrayList<Integer>();
        ArrayList<Integer> list2= new ArrayList<Integer>();
        list1.add(4);
        list1.add(3);
        
        list2.add(5);
        list2.add(10);
        list2.add(7);
        combine(list1,list2);
        System.out.println(list1);
        System.out.println(list2);
    }
}
