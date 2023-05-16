/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stack;

/**
 *
 * @author USER
 */
public class TestMyStack {

    public static void main(String[] args) {
        MyStack<Character> stack = new MyStack<>();
        MyStack<Integer> stack2 = new MyStack<>();
        //character stack
        //add elements
        stack.push('a');
        stack.push('b');
        stack.push('c');
        
        //print stack
        System.out.println(stack.toString());
        
        //check if element in stack
        System.out.println(stack.search('b'));
        System.out.println(stack.search('k'));
        
        //int stack
        //add
        stack2.push(1);
        stack2.push(2);
        stack2.push(3);
        
        //print
        System.out.println(stack2.toString());
        
        //search
        System.out.println(stack2.search(6));
    }
    
}
