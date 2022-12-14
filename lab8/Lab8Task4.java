/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lab8task4;

/**
 *
 * @author M
 */
import java.util.Scanner;
public class Lab8Task4 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        ShoppingBasket basket = new ShoppingBasket();
        basket.add("milk", 3);
        basket.print();
        System.out.println("basket price: " + basket.price() +"\n");

        basket.add("buttermilk", 2);
        basket.print();
        System.out.println("basket price: " + basket.price() +"\n");

        basket.add("milk", 3);
        basket.print();
        System.out.println("basket price: " + basket.price() +"\n");

        basket.add("milk", 3);
        basket.print();
        System.out.println("basket price: " + basket.price() +"\n");
            
        Storehouse store = new Storehouse();
        store.addProducts("coffee", 5, 10);
        store.addProducts("milk", 3, 20);
        store.addProducts("milkbutter", 2, 55);
        store.addProducts("bread", 7, 8);

        Shop shop = new Shop(store, new Scanner(System.in));
        shop.manage("Pekka");
    }
}
