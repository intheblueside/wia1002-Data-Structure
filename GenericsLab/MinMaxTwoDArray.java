/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.generics;

/**
 *
 * @author USER
 */
public class MinMaxTwoDArray {
    
    public static void main(String[] args) {
        Integer[][] numbers = {{4, 5, 6}, {1, 2, 3}};
        System.out.println("Minimum value " + min(numbers));
        System.out.println("Maximum value " + max(numbers));
    }
    
    //min generic method
    public static <E extends Comparable<E>> E min(E[][] list){
        E min = list[0][0];
        for(int i=0; i<list.length; i++){
            for(int j=0; j<list.length; j++){
                if(list[i][j].compareTo(min)<0){
                    min = list[i][j];
                }
            }
        }
        return min;
    }
    
    //max generic method
    public static <E extends Comparable<E>> E max(E[][] list){
        E max = list[0][0];
        for(int i=0; i<list.length; i++){
            for(int j=0; j<list.length; j++){
                if(list[i][j].compareTo(max)>0){
                    max = list[i][j];
                }
            }
        }
        return max;
    }

}

