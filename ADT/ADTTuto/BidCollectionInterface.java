/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package adt;

/**
 * @param <T>
 *
 * @author USER
 */
public interface BidCollectionInterface<T extends BidInterface> {
    
    //add bid to the collection
    public void addBid(T newItem);
    
    // return bid in the collection with best yearly cost
    public BidInterface getBestYearlyCost(double energyHour, double energyCost);
    
    //return bid with best initial cost = unit + installation
    public BidInterface getBestInitial();
    
    //clears all item from collection
    public void clear();
    
    //gets number of item in collection
    public int getCurrentSize();
    
    //see if collection empty
    public boolean isEmpty();
    
}
