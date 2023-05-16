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
public class CheckPalindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyStack myString = new MyStack();
        
        //user input string

        System.out.println("Enter a string: ");
        String input = sc.nextLine();
        
        if(input.length() < 15){
            System.out.println("Not enough characters in string!");
        } else{
            //push input

            for(int i=0; i<input.length(); i++){
                myString.push(input.charAt(i));
            }
            
            //reverse string
            String reverse = "";
            
            while(!myString.isEmpty()){
                reverse = reverse + myString.pop();
            }
            
            //check if input and reverse match
            if(input.equals(reverse)){
                System.out.println("String is palindrome");
            }else{
                System.out.println("String is not palindrome");
            }
        }
    }
}
