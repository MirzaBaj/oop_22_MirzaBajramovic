/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lab6task7;

/**
 *
 * @author M
 */
public class Lab6Task7 {

    public static void main(String[] args) {
     
        NightSky Nightsky = new NightSky(0.1, 40, 10);
        Nightsky.print();
        System.out.println("Number of stars: " + Nightsky.starsInLastPrint());
        System.out.println("");
        
        NightSky NightSky=new NightSky(0.2,15,6);
        NightSky.print();
        System.out.println("Number of stars: "+NightSky.starsInLastPrint());

     
     
     /*
      NightSky Nightsky = new NightSky(8,4);
        Nightsky.print();
        System.out.println("Number of stars: " + Nightsky.starsInLastPrint());
        System.out.println("");
        
        Nightsky.print();
        System.out.println("Number of stars: "+Nightsky.starsInLastPrint());
     */
    }
}
