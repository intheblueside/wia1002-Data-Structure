/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stack;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class TestIntMyStack {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyStack<Integer> stack = new MyStack<>();
        
        //prompt user to enter an int value
        System.out.println("Enter an integer: ");
        int value = sc.nextInt();
        
        //push value from user
        for(int i=1; i<=value; i++){
            stack.push(i);
        }
        
        //print stack
        System.out.println(stack);
        
        //print size
        System.out.println("Size of stack: " + stack.getSize());
        
        //display by calling pop until stack is empty
        while(!stack.isEmpty()){
            System.out.println("Pop element: " + stack.pop());
        }
        System.out.println("Stack is empty now");
        
        //what is output?
        // 1 3 becuase 1 was push in after user input push
        // so 1 pop out first 
    }
    
}
