/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stack;

/**
 *
 * @author USER
 */
public class StackWithADT {
    
    
    public static void main(String[] args) {
        MyStack<Integer> newStack = new MyStack<>();
        
        //setting number of elements to be 20 and push 1 - 20
        for(int i=0; i<=20; i++){
            newStack.push(i);
        }
        
        int sum = 0;
        
        //pop each value from stack and add 
        while(!newStack.isEmpty()){
            System.out.println(newStack);
            int x = newStack.pop();
            System.out.println("Pop: " + x);
            sum += x;
            System.out.println("Sum: " + sum);
        }
        
        //print sum of all elements in stack
        System.out.println("Total Sum of each element in stack is: " + sum);
    }
}
