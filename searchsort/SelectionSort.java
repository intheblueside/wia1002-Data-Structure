/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package searchsort;

/**
 *
 * @author USER
 */
public class SelectionSort {
    
    //question 1
    public void selectionSortSmallest(int[] list){
        
        for(int i=0; i<list.length; i++){
            int currentMin = list[i];
            int currentMinIndex = i;
            
            for(int j=i+1; j<list.length; j++){
                if(currentMin > list[j]){
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }
            
            //swap list[i] wiht new list if needed
            if(currentMinIndex != i){
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
        
    }
    
    //question 2
    public void selectionSortLargest(int[] list){
        
        for(int i=0; i<list.length; i++){
            int currentMax = list[i];
            int currentMaxIndex = i;
            
            for(int j=i+1; j<list.length; j++){
                if(list[j]> currentMax){
                    currentMax = list[j];
                    currentMaxIndex = j;
                }
            }
            
            //swap list[i] wiht new list if needed
            if(currentMaxIndex != i){
                list[currentMaxIndex] = list[i];
                list[i] = currentMax;
            }
        }
        
    }
    
    //insertion sort
    public void insertionSort(int[] list){
        for(int i=0; i<list.length; i++){
            int currentElement = list[i];
            int k;
            for(k = i -1; k>=0 && list[k] > currentElement; k--){
                list[k+1] = list[k];
            }
            list[k + 1] = currentElement;
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {45, 7, 2, 8, 19, 3};
        
        SelectionSort ss = new SelectionSort();
        ss.selectionSortSmallest(arr);
        
        
        System.out.println("Smallest Sort");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
        SelectionSort ss2 = new SelectionSort();
        ss2.selectionSortLargest(arr);
        
        System.out.println("Largest Sort");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
        SelectionSort ss3 = new SelectionSort();
        int[] array = {10,34,2,56,7,67,88,42};
        
        ss3.insertionSort(array);
        
        System.out.println("Insertion Sort");
        for(int i=0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
