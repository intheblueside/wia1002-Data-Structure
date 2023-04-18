/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adt;

/**
 *
 * @author USER
 */
public final class ArrayBag<T> implements BagInterface<T> {
    
    private T[] bag;
    private static final int DEFAULT_CAPACITY =25;
    private int numberOfEntries;

    public ArrayBag() {
        this(DEFAULT_CAPACITY);
    }

    public ArrayBag(int capacity) {
        T[] temp = (T[])new Object[capacity];
        bag = temp;
        numberOfEntries = 0;
    }
    
    @Override
    public int getCurrentSize() {
        return numberOfEntries;
    }

    @Override
    public boolean isFull() {
        return numberOfEntries >= bag.length;
    }

    @Override
    public boolean isEmpty() {
        return numberOfEntries == 0;
    }

    @Override
    public boolean add(T newEntry) {
        if(numberOfEntries == bag.length || newEntry == null){
            return false;
        }else {
            bag[numberOfEntries] = newEntry;
            numberOfEntries++;
            return true;
        }
    }

    @Override
    public T remove() {
        T result = null;
        if(!isEmpty()){
            result = bag[numberOfEntries -1];
            bag[numberOfEntries -1] = null; //eliminate from array
            numberOfEntries--;
        }
        return result;
    }

    @Override
    public boolean remove(T anEntry) {
        if(!isEmpty()){
            for(int i=0; i<numberOfEntries; i++){
                if (bag[i].equals(anEntry)){
                    //shift remaining item to left
                    for(int j=i; j<numberOfEntries - 1; j++){
                        bag[j] = bag[i+1];
                    }
                    bag[numberOfEntries - 1] = null;
                    numberOfEntries--;
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public void clear() {
        for(int i=0; i<bag.length; i++){
            bag[i]=null;
        } //no need to loop
        numberOfEntries = 0; //will overwrite number of entries to 0
    }

    @Override
    public int getFrequencyOf(T anEntry) {
        int count = 0;
        for(int i=0; i<numberOfEntries; i++){
            if(bag[i].equals(anEntry)){
                ++count;
            }
        }
        return count;
    }

    @Override
    public boolean contains(T anEntry) {
        
        for(int i=0; (i<numberOfEntries); i++){
            if(anEntry.equals(bag[i])){
                return true;
            }
        }
        return false;
    }

    @Override
    public T[] toArray() {
        T[] result = (T[])new Object[numberOfEntries];
        for(int i=0; i<numberOfEntries; i++){
            result[i] = bag[i];
        }
        return result;
    }

    @Override
    public BagInterface<T> union(BagInterface<T> aBag) {
        //declare new generic array with capacity = bag1 + bag2
        T[] bagA = this.toArray();
        T[] bagB = aBag.toArray();
        int totalBagSize = bagA.length + bagB.length;
        
        ArrayBag<T> unionOfBag = new ArrayBag<>(totalBagSize);
        //for loop that loops throguh bag1 and add everything in a new 
        //add everything 
        for(int i=0; i<bagA.length; i++){
            unionOfBag.add(bagA[i]);
        }
        for(int i=0; i<bagB.length; i++){
            unionOfBag.add(bagB[i]);
        }
        return unionOfBag;
    }

    @Override
    public BagInterface<T> intersection(BagInterface<T> aBag) {
        T[] bagA = this.toArray(); //bag1
        T[] bagB = aBag.toArray(); //bag2
        
        ArrayBag<T> intersectBag = new ArrayBag<>(bagA.length);
        
        for(int i=0; i< bagA.length; i++){
            for(int j=0; j< bagB.length; j++){
                if(bagA[i].equals(bagB[j])){
                    intersectBag.add(bagB[j]);
                    bagB[j] = null; //remove 
                    break;
                }
            }
        }
        return intersectBag;
    }

    @Override
    public BagInterface<T> difference(BagInterface<T> dBag) {
        T[] bagA = this.toArray();
        T[] bagB = dBag.toArray();
        
        ArrayBag<T> differentBag = new ArrayBag<>(bagA.length);
        
        for(int i=0; i<bagA.length; i++){
            for(int j=0; j<bagB.length; j++){
                if(bag[i].equals(bagB[j])){
                    bagA[i] = null;
                    bagB[j] = null;
                    break;
                }
            }
        }
        for(int i=0; i<bagA.length; i++){
            if(bagA[i] != null){
                differentBag.add(bagA[i]);
            }
        }
        
        return differentBag;
    }

    
}
