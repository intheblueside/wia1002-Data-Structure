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
public class Duo<A,B> {
//variable
    private A first;
    private B second;
    //constructor
    public Duo(A first, B second){
        this.first = first;
        this.second = second;
    }
    
    public static void main(String[] args) {
        //objects
        Duo<String,Integer> sideShape = new Duo<>("Hello", 25);
        Duo<Double,Double> points = new Duo<>(14.2,5.3);
    }

}
