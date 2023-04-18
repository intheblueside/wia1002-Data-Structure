/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adt;

/**
 *
 * @author USER
 */
public class ArrayBagDemo {

    private static void testAdd(BagInterface<String> aBag, String[] content){
        System.out.println("Adding: ");
        for(String item: content){
            aBag.add(item);
            System.out.print(item + " ");
        }
        System.out.println();
    }
    private static <String> void displayBag(BagInterface<String> aBag){
        String[] item = aBag.toArray();
        
        for(int i=0; i<aBag.getCurrentSize(); i++){
            System.out.print(item[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ArrayBag<String> bag1 = new ArrayBag<>();
        ArrayBag<String> bag2 = new ArrayBag<>();
        
        String[] contentsOfBag1 = {"A", "A", "B", "A", "C", "A"};
        String[] contentsOfBag2 = {"A", "B", "A", "C", "B", "C", "D", "another string"};
        
        //bag1
        System.out.println("Bag1 ");
        testAdd(bag1, contentsOfBag1);  //add contents to bag1
        System.out.println("The bag contains " + contentsOfBag1.length + " string(s), as follows: ");
        displayBag(bag1); // display contents in bag1
        System.out.println();
        
        //bag2
        System.out.println("Bag2 "); 
        testAdd(bag2, contentsOfBag2);//add contents to bag2
        System.out.println("The bag contains " + contentsOfBag2.length + " string(s), as follows: ");
        displayBag(bag2); //display contents in bag2
        System.out.println();

        //bag3 - union of contents in bag1 and bag2
        System.out.println("Bag3, Test method Union of Bag1 and Bag2");
        BagInterface<String> bag3 = bag1.union(bag2);
        System.out.println("The bag contains " + bag3.getCurrentSize() + " string(s), as follows: ");
        displayBag(bag3); //display contents in bag3
        System.out.println();
        
        //bag4 - intersection of contents in bag1 and bag2
        System.out.println("Bag4, Test method Intersection of Bag1 and Bag2");
        BagInterface<String> bag4 = bag1.intersection(bag2);
        System.out.println("The bag contains " + bag4.getCurrentSize() + " string(s), as follows: ");
        displayBag(bag4); //display contents in bag4
        System.out.println();
        
        //bag5 - difference of contents in bag1 and bag2
        System.out.println("Bag5, Test method differnce of bag1 and bag2");
        BagInterface<String> bag5 = bag1.difference(bag2);
        System.out.println("The bag contains " + bag5.getCurrentSize() + " string(s), as follows: ");
        displayBag(bag5); //display contents in bag5
    }
    
}
