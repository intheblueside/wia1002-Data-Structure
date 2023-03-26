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
        
        final StorePair<?> other = (StorePair<?>) obj;
        if (this.first != other.first) {
            return false;
        }
        if (this.second != other.second) {
            return false;
        }
        return true;
    }
    
    
    
    @Override
    public int compareTo(StorePair<T> o){
        return first.compareTo(o.getFirst());
    }
    
}
