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
public class FindMax {

    public static void main(String[] args) {
        Integer[] a = {1,2,3};
        String[] b = {"red", "green", "blue"};
        Circle[] c = {new Circle(3), new Circle(2.9), new Circle(5.9)};
        System.out.println(max(a));
        System.out.println(max(b));
        System.out.println(max(c));    
    }   
    //max method to compare and find maximum 
    public static <E extends Comparable<E>> E max(E[] list){
        E max = list[0];
        for(int i=1; i<list.length; i++){
            if(list[i].compareTo(max)>0){
                max = list[i];
            }
        }
        return max;
    }
}
class Circle implements Comparable<Circle> {
    
    private double radius;
    
    public Circle(double radius){
        this.radius=radius;
    }
    
    public double getRadius(){
        return radius;
    }
    
    @Override
    public int compareTo(Circle o){
        //use Double.compare to compare double values
        //Double data type: this.radius.compareTo(o.getRadius());
        return Double.compare(radius, o.getRadius());
    }
    
    @Override
    public String toString(){
        return radius + " ";
    }
}
