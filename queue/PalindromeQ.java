/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package queue;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class PalindromeQ {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
       //input string
        System.out.println("Enter a string to check if palindrome: ");
        String input = sc.nextLine();
        
        //create queue
       MyQueue<Character> queue = new MyQueue<>();
       
       //enqueue characters of string
       for(int i= input.length()-1; i>=0; i--){
           queue.enqueue(input.charAt(i));
       }
       
       String reverse = "";
       
       //reverse string using dequeue
       while(!queue.isEmpty()){
           reverse += queue.dequeue();
       }
       
       //check if enqueue n dequeue are similar
       if(input.equalsIgnoreCase(reverse)){
           System.out.println("String is palindrome!");
       }else{
           System.out.println("String is NOT palindrome");
       }
    }
    
}
