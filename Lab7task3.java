/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lab7task3;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author M
 */
public class Lab7task3 {

    public static void main(String[] args) {
          Dictionary dictionary = new Dictionary();
  /*  dictionary.add("apina", "monkey");
    dictionary.add("banaani", "banana");
    dictionary.add("cembalo", "harpsichord");
 
    System.out.println(dictionary.translate("apina"));
    System.out.println(dictionary.translate("porkkana"));
*/
  
 /*     dictionary.add("apina", "monkey");
    dictionary.add("banaani", "banana");
    System.out.println(dictionary.amountOfWords());
 
    dictionary.add("cembalo", "harpsichord");
    System.out.println(dictionary.amountOfWords());
    }
*/
    //Dictionary dictionary = new Dictionary();
    dictionary.add("apina", "monkey");
    dictionary.add("banaani", "banana");
    dictionary.add("cembalo", "harpsichord");
 
    ArrayList<String> translations = dictionary.translationList();
    for(String translation: translations) {
        System.out.println(translation);
    }
    
    
    String input="quit\n";
    
    
    Scanner reader=new Scanner(input);
     TextUserInterface ui = new TextUserInterface(reader, dictionary);
       ui.start();
    }
    
    
}
