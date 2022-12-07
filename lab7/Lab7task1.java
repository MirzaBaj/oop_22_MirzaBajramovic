/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lab7task1;
import java.util.HashMap;

/**
 *
 * @author M
 */
public class Lab7task1 {

    public static void main(String[] args) {
        HashMap<String,String> names=new HashMap<String,String>();
        names.put("matti","mage");
        
        names.put("mikael","mixu");
        
        names.put("arto","arppa");
        
        System.out.println(names.get("matti"));
        
    }
}
