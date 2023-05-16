/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package queue;

import java.util.LinkedList;

/**
 *
 * @author USER
 */
public class MyQueue<E> {
    LinkedList<E> list;
    

    public MyQueue(E[] e){
        list = new LinkedList<>();
        for(int i=0; i< e.length; i++){
            list.addLast(e[i]);
        }
    }
    //default constructor
    public MyQueue() {
        list = new LinkedList<>();
    }
    //add value in queue
    public void enqueue(E e){
        list.addLast(e);
    }
    //remove value from queue
    public E dequeue(){
        return list.removeFirst();
    }
    //return index of element
    public E getElement(int i){
        return list.get(i);
    }
    //return top of queue
    public E peek(){
        return list.getFirst();
    }
    //return size of queue
    public int getSize(){
        return list.size();
    }
    //return if element is in queue
    public boolean contains(E e){
        return list.contains(e);
    }
    //return if queue is empty
    public boolean isEmpty(){
        return list.isEmpty();
    }
    //display queue in string
    @Override
    public String toString() {
        return "MyQueue = " + list.toString();
    }
}
