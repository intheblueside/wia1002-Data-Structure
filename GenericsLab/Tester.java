/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.generics;

import java.util.ArrayList;

/**
 *
 * @author USER
 * 
 */
public class Tester {
    public static void main(String[] args) {
        
        //create instance string, integer
        MyGenerics<String> strObj = new MyGenerics<>();
        MyGenerics<Integer> intObj = new MyGenerics<>();
        
        //set values
        strObj.setE("Hello String");
        intObj.setE(2150);
        
        //display values
        System.out.println(strObj.getE());
        System.out.println(intObj.getE());
        

        
    }
    
    
}
