/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.task8;

/**
 *
 * @author M
 */
import java.util.Scanner;
import java.util.Random;
public class Task8 {
    
    public static int drawNumber(){
        Random rand=new Random();
        int number1=rand.nextInt(100);
        return number1;
    } 

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
       
        int number1=drawNumber();
        int number2,counter=0;
        while(true){
            System.out.println("Guess a number");
            number2=Integer.parseInt(reader.nextLine());
            counter++;
            if(number2 > number1){
                System.out.println("The number is lesser, guesses made: "+counter);
            }
            else if(number2 < number1){
                System.out.println("The number is greater. guesses made: "+counter);
            }
            else{
                System.out.println("Congratulations, your guess is correct!");
                System.out.println("You made "+counter+" guesses");
                break;
            }
        }
        
        
      
        
        
    }
}
