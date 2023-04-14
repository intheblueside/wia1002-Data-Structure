/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkedlist;

/**
 *
 * @author USER
 */
public class Node<E> {
    //store value
    E e;
    //next node points to nect values
    Node<E> next;

    public Node() {
    }
    
    Node(E e){
        this.e=e;
    }
    Node(E e, Node<E> next){
        this.e =e;
        this.next = next;
    }

}
