/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab6task8;

/**
 *
 * @author M
 */
public class StringUtils {
    public static boolean included(String word, String searched){
        word=word.toUpperCase();
        word=word.trim();
        searched=searched.toUpperCase();
        searched=searched.trim();
        return word.contains(searched);
    }
    
}
