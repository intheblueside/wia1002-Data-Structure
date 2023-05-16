/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stack;

import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class MyStack<E> {

    private ArrayList<E> stack = new ArrayList<>();
    
    public int getSize(){
        return stack.size();
    }
    
    public void push(E e){
        stack.add(e);
    }
    
    public E pop(){
        E o = stack.get(getSize() - 1);
        stack.remove(getSize() - 1);
        return o;
    }
    
    public E peek(){
        return stack.get(getSize() - 1);
    }
    
    public boolean isEmpty(){
        return stack.isEmpty();
    }
    
    @Override
    public String toString(){
        return "Stack: " + stack.toString();
    }
    
    public boolean search(E o){
        if (stack.contains(o)){
            return true;
        }else{
            return false;
        }
    }
}
