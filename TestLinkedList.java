/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package linkedlist;

/**
 *
 * @author USER
 */
public class TestLinkedList {
    public static void main(String args[]){
        MyLinkedList<Character> linked = new MyLinkedList<>();
        linked.addFirst('a'); //append a b c d e
        linked.add(1,'b');
        linked.add(2,'c');
        linked.add(3,'d');
        linked.addLast('e');
        System.out.println("New list: ");
        linked.print(); //print all elements in the list
        
        System.out.println("Reversed list: ");
        linked.reverse(); //reverse all elements in list
        linked.print(); // print the reverse list 
        
        System.out.println("Link size: " + linked.getSize()); //retrieve number of elements in list
        
        System.out.println("First element " + linked.getFirst());
        System.out.println("Last element " + linked.getLast());//retrieve first and last value in list
        
        linked.remove(3); //delete third value 
        System.out.println("List after removed third value: ");
        linked.print();
        
        System.out.println("Index for second value: " + linked.indexOf('b'));// retrieve index loc for 3rd and 4th value
        System.out.println("Index for third value: " + linked.indexOf('c'));
        
        System.out.println("List contains character c: " + linked.contains('c')); //check if list has 'c'
        
        System.out.println("Replace list with java");
        linked.set(0, 'j');//replace list with 'j' 'a' 'v' 'a'
        linked.set(1, 'a');
        linked.set(2, 'v');
        linked.set(3, 'a');
        linked.print();
        
        System.out.println("Middle Value: " + linked.getMiddleValue());
    }

    
}
