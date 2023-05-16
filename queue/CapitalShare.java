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
public class CapitalShare {

    public static void main(String[] args) {
        
        MyQueue<String> queueShare = new MyQueue<>();
        MyQueue<String> queuePrice = new MyQueue<>();
        
        int totalCap = 0;
        
        Scanner sc = new Scanner(System.in);
        
        //ask user to enter query
        while(true){
            System.out.println("Enter your query (In format 'Buy / Sell x shares at $y each'): ");
            String inputShare = sc.nextLine();
            
            //exit loop
            if(inputShare.equals("")){
                break;
            }
            //split string by space
            String[] input = inputShare.split(" ");
            String share = input[1];
            String price = input[4].replace("$", "");
            
            if(inputShare.startsWith("B")){
                //if buy load- buying now
                System.out.println("Buying now...");
                
                queueShare.enqueue(share);
                queuePrice.enqueue(price);

                //display queue for share and price
                System.out.println("Queue for Share: " + queueShare);
                System.out.println("Queue for Price: " + queuePrice);

                        
            }else if(inputShare.startsWith("S")){
                //if sell load - selling now
                System.out.println("Selling the shares now...");
                
                //quantity of shares
                int sellShares = Integer.parseInt(share); 
                int remainingShare = 0;
                
                do {
                    if(!queueShare.isEmpty()){
                        int totalShare = Integer.parseInt(queueShare.dequeue());
                        int totalPrice = Integer.parseInt(queuePrice.dequeue());
                        
                        if (totalShare >= sellShares){
                            totalCap = totalCap + sellShares * (Integer.parseInt(price) - totalPrice);
                            remainingShare = totalShare - sellShares;
                            
                            if(remainingShare > 0){
                                insertRemaining(queueShare, remainingShare);
                                insertRemaining(queuePrice, totalPrice);
                            }
                        }else{
                            totalCap = totalCap + sellShares * (Integer.parseInt(price) - totalPrice);
                        }
                        //if selling- display total capital loss
                        System.out.println("Total Capital Gain / Loss: " + totalCap);
                        sellShares -= totalShare;
                    }else{
                        System.out.println("No shares to sell");
                        sellShares = 0;
                    }
                }while(sellShares > 0);
                
                //display queue for share and price
                System.out.println("Queue for Share: " + queueShare);
                System.out.println("Queue for Price: " + queuePrice);
            
            }else if(!inputShare.startsWith("B") && !inputShare.startsWith("S") ){
                System.out.println("Invalid input");
            }
        }
        //final capital
        System.out.println("Final Capital Gain / Loss: " + totalCap);
        
    }
    
    public static void insertRemaining(MyQueue<String> q, int remain){
        MyQueue<String> temp = new MyQueue<>();
        temp.enqueue(Integer.toString(remain));
        
        while(!q.isEmpty()){
            temp.enqueue(q.dequeue());
        }
        while(!temp.isEmpty()){
            q.enqueue(temp.dequeue());
        }
    }
    
}
