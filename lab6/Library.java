/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab6task8;
import java.util.ArrayList;
/**
 *
 * @author M
 */
public class Library {
    private static ArrayList<Book> library = new ArrayList<Book>();
    
    public void addBook(Book newBook){
        library.add(newBook);
    }
    
    public void printBooks(){
        for(Book b : library){
            System.out.println(b);
        }
    }
    
    public static ArrayList<Book> searchByTitle(String title){
        ArrayList<Book> found = new ArrayList<Book>();
        for(Book b : library){
            if(b.title().contains(title)){
                found.add(b);
            }
          
            if(StringUtils.included(b.title(), title)){
                found.add(b);
            }
        }
    
        return found;
    }
        public static ArrayList<Book>searchByPublisher(String publisher){
            ArrayList<Book> found=new ArrayList<Book>();
            for(Book b: library){
                if(b.publisher().contains(publisher))
                    found.add(b);
                if(StringUtils.included(b.publisher(),publisher))
                    found.add(b);
            }
            return found;
        }
         public static ArrayList<Book> searchByYear(int year){
             ArrayList<Book> found= new ArrayList<Book>();
             for(Book b: library){
                 if(b.year()==year)
                     found.add(b);
                 
             }
             return found;
         }
        
    
}
