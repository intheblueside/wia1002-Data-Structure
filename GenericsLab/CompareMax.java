/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.generics;

/**
 *
 * @author USER
 */
public class CompareMax {

    //generic static method extends COmparable interface, compare with T, no <T> is raw type
    public static <T extends Comparable<T>> T maximum (T v1, T v2, T v3){
        if(v1.compareTo(v2) >0 && v1.compareTo(v3)>0){
            return v1;
        }else if(v2.compareTo(v3)>0 && v2.compareTo(v1)>0){
            return v2;
        }else{
            return v3;
        }
    }
    /*
    T max = v1;
    if (v2.compareTo(max)>0){
    max = v2;
    }
    if(v3.compareTo(max)>0){
    max =  v3;
    }
    else{
    return max;
    }
    */
    
    public static void main(String[] args) {
        System.out.println(maximum(5,4,3));
        System.out.println(maximum("hello", "new","string"));
        
    }
    
}
