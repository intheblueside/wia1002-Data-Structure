/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package searchsort;

/**
 *
 * @author USER
 */
public class LinearBinary {

    //linear search
    public static int linearSearch(int[] list, int key){
        for(int i = 0; i<list.length; i++){
            if(key == list[i]){
                return i;
            }
        }
        return -1;
    }
    
    //binary search
    public static int binarySearch(int[] list, int key){
        int low = 0;
        int high = list.length - 1;
        
        while(high >= low){
            int mid = (low + high) / 2;
            if(key < list[mid]){
                high = mid - 1;
            }else if(key == list[mid]){
                return mid;
            }else{
                low = mid + 1;
            }
            
        }return -1 - low;
    }
    
    //main
    public static void main(String[] args) {
        int[] list = {3,8,12,34 ,54 ,85 ,61,110 };
        
        System.out.println("Linear Search: ");
        System.out.println("Index of 54 is " + linearSearch(list, 54));
        System.out.println("Index of 45 is " +linearSearch(list, 45));
        System.out.println("Binary Search: ");
        System.out.println("Index of 54 is " +binarySearch(list, 54));
        System.out.println("Index of 45 is " +binarySearch(list, 45));
    }
    
}
