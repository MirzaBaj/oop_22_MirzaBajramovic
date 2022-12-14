/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab8task3;

/**
 *
 * @author M
 */
public class GenericClass<T> {
    private T value;
    
    public GenericClass(T v){
        this.value=v;
    }
    
    public T getValue(){
        return this.value;
    }
}
