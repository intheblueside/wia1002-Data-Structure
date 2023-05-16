/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package queue;

/**
 *
 * @author USER
 */
public class TestQueue {

    public static void main(String[] args) {
        
        //initialized queue elements
        String[] fruit = {"Durian", "Blueberry"};
        
        //create queue
        MyQueue<String> fruitQ = new MyQueue<>(fruit);
        
        //add eleemtns
        fruitQ.enqueue("Apple");
        fruitQ.enqueue("Orange");
        fruitQ.enqueue("Grapes");
        fruitQ.enqueue("Cherry");
        
        //display queue
        System.out.println(fruitQ.toString());
        
        //show top item
        System.out.println("Top Item of Queue: " + fruitQ.peek());
        
        //get queue size
        System.out.println("Size of Queue: " + fruitQ.getSize());
        
        //delete durian
        fruitQ.dequeue();
        
        //get item index postiion of 2
        System.out.println("Index item 2: " + fruitQ.getElement(2));
        
        //check whether queue has cherry
        System.out.println("Is cherry in queue?: " + fruitQ.contains("Cherry"));
        
        //check whether queue has durian
        System.out.println("Is durian in queue?: " + fruitQ.contains("Durian"));
        
        //display queue using isempty condition
        if(!fruitQ.isEmpty()){
            System.out.println("Queue: " + fruitQ.toString());
        }
    }
    
}
