/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.generics;

/**
 *
 * @author USER
 */
public class MyGenerics <T>{
    T e;

    //empty constructor
    public MyGenerics() {
    }

    //accepts one parameter constructor
    public MyGenerics(T e) {
        this.e = e;
    }
    //getter
    public T getE() {
        return e;
    }
    //setter
    public void setE(T e) {
        this.e = e;
    }  
}
