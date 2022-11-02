/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lab3task6;

/**
 *
 * @author M
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Lab3Task6 {

    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        ArrayList<String> words= new ArrayList<String>();
        
        
        while(true){ 
            System.out.println("Type a word: ");
            String word=reader.nextLine();
            if(words.contains(word)){
                System.out.println("You gave the word "+word+" twice");
                break;
            }
            else{
                words.add(word);
            }
        } 
        Collections.sort(words);
        System.out.println("Words you entered: ");
        for(String word2: words){
        System.out.println(word2);
        }
             
            
           
                      
       
        
    }
}
