/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.generics;

/**
 *
 * @author USER
 */
public class MyArray {
   
    //main method
    public static void main(String[] args) {
        Integer[] number = {1,2,3,4,5};
        String[] names = {"Jane", "Tom", "Bob"};
        Character[] alphabet = {'a', 'b', 'c'};
        
        //pass array to generic method
        listAll(number);
        listAll(names);
        listAll(alphabet);
    }
    
    //generic method
    public static <T> void listAll(T[] list){
        for(T items: list){
            System.out.println(items);
        }
        System.out.println();
    }
}
