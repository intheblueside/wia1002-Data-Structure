/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.generics;

import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class Main {
//generic method return nothing
    public static <T> void allTransportation(ArrayList<?> vehicle, ArrayList<?> transport){
        
        //other possible method types:
        //public static <T> void allTransportation(ArrayList<T> vehicle, ArrayList<? super T> transport)
        //or
        //public static <T> void allTransportation(ArrayList<? extends T> vehicle, ArrayList<T> transport)
        
        //print for parameter 1
        for(Object items: vehicle){
            System.out.println(items);
        }
        System.out.println();
        
        //print for parameter 2
        for(Object items: transport){
            System.out.println(items);
        }  
    }
    public static void main(String[] args) {
        ArrayList<String> vehicle = new ArrayList<>(); 
        ArrayList<Object> transportation = new ArrayList<>(); 
        //pass arguments
        allTransportation(vehicle,transportation);
    }
}

   
