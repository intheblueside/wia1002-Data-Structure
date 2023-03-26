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
        /*
        //create instance string, integer
        MyGenerics<String> strObj = new MyGenerics<>();
        MyGenerics<Integer> intObj = new MyGenerics<>();
        
        //set values
        strObj.setE("Hello String");
        intObj.setE(2150);
        
        //display values
        System.out.println(strObj.getE());
        System.out.println(intObj.getE());
        
        */
        
        //create objects 
        StorePair<Integer> obj1 = new StorePair<>(6,4);
        StorePair<Integer> obj2 = new StorePair<>(2,2);
        StorePair<Integer> obj3 = new StorePair<>(6,3);
        
        //compare values
        if(obj1.compareTo(obj2)> 0 && obj1.compareTo(obj3)>0){
            System.out.println(obj1.toString());
        }else if(obj2.compareTo(obj1)> 0 && obj2.compareTo(obj3)>0){
            System.out.println(obj2.toString());
        } else if (obj3.compareTo(obj2)> 0 && obj3.compareTo(obj1)>0){
            System.out.println(obj3.toString());
        }
        
        //find equal in values
        System.out.println("obj1 == obj2 : " + obj1.equals(obj2));
        System.out.println("obj2 == obj3 : " + obj2.equals(obj3));
        System.out.println("obj1 == obj3 : " + obj1.equals(obj3));
        
        
        
    }
    
    
}
