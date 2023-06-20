/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package graph;

/**
 *
 * @author USER
 */
public class NewGraph<T extends Comparable<T>> extends WeightedGraph<T, Integer> {
    
    @Override
    public boolean addUndirectedEdge(T source, T destination, Integer w)   {
       
      return (addEdge(source,destination,w) && (addEdge(destination,source,w)));
   }
    
    public boolean addEdge(T source, T destination) {
        return super.addEdge(source, destination, 1);
    }

}
