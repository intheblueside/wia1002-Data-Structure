/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package searchsort;

/**
 *
 * @author USER
 */
public class Sort {

    //selection
    public static void selectionSort(int[] list){
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
    
    //insertion
    public static void insertionSort(int[] list){
        for(int i=0; i<list.length; i++){
            int currentElement = list[i];
            int k;
            for(k = i -1; k>=0 && list[k] > currentElement; k--){
                list[k+1] = list[k];
            }
            list[k + 1] = currentElement;
        }
    }
    
    //bubble sort
    public static void bubbleSort(int[] list){
        boolean nxtPass = true;
        
        for(int k=1; k<list.length && nxtPass; k--){
            nxtPass = false;
            for(int i=0; i<list.length-k; i++){
                if(list[i]>list[i+1]){
                    int temp = list[i];
                    list[i] = list[i+1];
                    list[i+1] = temp;
                    
                    nxtPass = true;
                }
            }
        }
    }
    
    //merge sort
    public static void mergeSort(int[] list){
        if(list.length > 1){
            //merge sort first half
            int[] firstHalf = new int[list.length / 2];
            System.arraycopy(list, 0, firstHalf, 0, list.length /2);
            mergeSort(firstHalf);
            
            //merge second half
            int secHalfLength = list.length - list.length/2;
            int[] secHalf = new int[secHalfLength];
            System.arraycopy(list, list.length/2, secHalf, 0, secHalfLength);
            mergeSort(secHalf);
            
            //merge 1st + 2nd
            merge(firstHalf, secHalf, list);
        }
    }
    
    //to merge 2 lists
    public static void merge(int[] list1, int[] list2, int[] temp){
        int current1 = 0;
        int current2 = 0;
        int current3 = 0;
        
        while(current1 < list1.length && current2 < list2.length){
            if(list1[current1] < list2[current2]){
                temp[current3++] = list1[current1++];
            }else{
                temp[current3++] = list1[current2++];
            }
        }
        
        while(current1 < list1.length){
             temp[current3++] = list1[current1++];
        }
        while(current2 < list2.length){
             temp[current3++] = list2[current2++];
        }
    }
    
    //main
    public static void main(String[] args) {
        int[] list = {90, 8, 7, 56, 125, 237, 9 ,1 ,653};
        
        selectionSort(list);
        System.out.println("Selection Sort");
        for(int i=0; i<list.length; i++){
            System.out.print(list[i] + " ");
        }
        
        insertionSort(list);
        System.out.println("\nInsertion Sort");
        for(int i=0; i<list.length; i++){
            System.out.print(list[i] + " ");
        }
        
        bubbleSort(list);
        System.out.println("\nBubble Sort");
        for(int i=0; i<list.length; i++){
            System.out.print(list[i] + " ");
        }
        
        mergeSort(list);
        System.out.println("\nMerge Sort");
        for(int i=0; i<list.length; i++){
            System.out.print(list[i] + " ");
        }
    }
    
}
