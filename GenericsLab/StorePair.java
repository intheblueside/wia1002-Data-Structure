/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.generics;

/**
 *
 * @author USER
 */
public class StorePair<T extends Comparable<T>> implements Comparable<StorePair <T>> {
    
    private T first, second;
    
    public StorePair(T first, T second) {
        this.first = first;
        this.second = second;
    }
    public T getFirst() {
        return first;
    }
    public T getSecond() {
        return second;
    }
    public void setPair(T first, T second) {
        this.first = first;
        this.second = second;
    }
    @Override
    public String toString() {
        return "first = " + first + " second = " + second;
    }

    @Override
    public boolean equals(Object obj) {
        
        if(this == obj){
            return true;
        }
        if(obj == null || getClass() != obj.getClass()){
            return false;
        }
        
        StorePair<T> oth = (StorePair<T>) obj;
        return this.first.equals(oth.first);
        
    }
    
    @Override
    public int compareTo(StorePair<T> o){
        return first.compareTo(o.getFirst());
    }
    
    public static void main(String[] args) {
        StorePair<Integer> a = new StorePair<>(6,4);
        StorePair<Integer> b = new StorePair<>(2,2);
        StorePair<Integer> c = new StorePair<>(6,3);
        
        
        //find equal in values
        System.out.println("a equals b : " + a.equals(b));
        System.out.println("b equals c : " + b.equals(c));
        System.out.println("a equals c : " + a.equals(c));
    }
    
}
