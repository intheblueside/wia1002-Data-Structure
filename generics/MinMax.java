/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.generics;

/**
 *
 * @author USER
 */
public class MinMax {

    //generic method with return
    public static <T extends Comparable<T>> String minmax(T[] nums){
        T min = nums[0];
        T max = nums[0];
        
        for(int i=1; i<nums.length; i++){
            T result = nums[i];
            if(nums[i].compareTo(max)>0){
                max = result;
            }else if (nums[i].compareTo(min)<0){
                min = result;
            }
        }
        return "Min = " + min + " Max = " + max;
    }
    
    public static void main(String[] args) {
        Integer[] intArray = {5,3,7,1,4,9,8,2};
        String[] strArray = {"red", "blue", "orange", "tan"};
        System.out.println(minmax(intArray));
        System.out.println(minmax(strArray));
    }
    
}
