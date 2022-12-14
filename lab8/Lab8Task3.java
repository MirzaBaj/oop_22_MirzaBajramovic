/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lab8task3;

/**
 *
 * @author M
 */
public class Lab8Task3 {

    public static void main(String[] args) {
        GenericClass<Integer> g1=new GenericClass(10);
        System.out.println("Integger: "+g1.getValue());
        GenericClass<String> g2=new GenericClass("mirza");
        System.out.println("String: "+g2.getValue());
   }
}
