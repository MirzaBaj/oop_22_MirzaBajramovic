/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lab3task7;

/**
 *
 * @author M
 */
//  import java.util.Scanner;
import java.util.ArrayList;

public class Lab3Task7 {
    public static ArrayList<Integer> lenghts(ArrayList<String> list){
        ArrayList<Integer> duzine= new ArrayList<Integer>();
        for(String strings: list){
            duzine.add(strings.length());
        }
    
        return duzine;
}

    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<String>();
        list.add("Hallo");
        list.add("Moi");
        list.add("Benvenuto!");
        list.add("badger badger badger badger");
        
        ArrayList<Integer> lengths=lenghts(list);
        
        System.out.println("The lengths of the Strings:"+lengths);
    }
}
