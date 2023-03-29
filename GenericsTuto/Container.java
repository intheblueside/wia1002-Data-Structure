/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.generics;

/**
 *
 * @author USER
 */
public class Container<T> {
    
    private T t;
    public Container(){

    }

    //method add return nothing accepting generic type parameter
    public void add(T t){
        this.t = t;
    }
    // generic method retrive
    public T retrive(){
        return t;
    }

    public static void main(String[] args) {
        
        Container<Integer> container1 = new Container<>();
        Container<String> container2 = new Container<>();
        
        //append values to container
        container1.add(50);
        container2.add("Java");
        
        //display objects 
        System.out.println(container1.retrive());
        System.out.println(container2.retrive());
    }
}

    
    

