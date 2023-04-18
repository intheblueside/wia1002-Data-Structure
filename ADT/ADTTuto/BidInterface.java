package adt;

/**
 *
 * @author USER
 */
public interface BidInterface {
    
    /*return name of company
    precondition: none
    postcondition: name was returned
    @return the name of the company
    */
    public String getName();
    
    //return description of AC in bid
    public String getDescription();
    
    //return capacity of bid
    public double getSeasonal();
    
    //return seasonal efficiency
    public double getCapacity();
    
    //return cost of bid AC
    public double getCostBid();
    
    //return cost of installing
    public double getCostInstall();
    
    //return yearly cost of operating 
    public double getCostYearly(double hoursOperated, double energyCost);
    //getUnitCost();
    
}
