/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package graph;

import java.util.ArrayList;

/**
 *
 * @author USER
 */
class Graph <T extends Comparable<T>> {
    
    static class Vertex<T extends Comparable<T>>{
        Vertex<T> nextV;
        Edge<T> firstEdge;
        T item;
        
        Vertex(T item){
            this.item = item;
        }
    }
    
    static class Edge<T extends Comparable<T>>{
        Vertex<T> toV;
        Edge<T> nextEdge;
        T item;
        
        Edge(Vertex<T> toVertex, Edge<T> nextE){
            this.toV = toVertex;
            this.nextEdge = nextEdge;
        }
    }
    
    Vertex<T> head;
    int size;
    
    
    public int getSize(){   //get size of graph
        return this.size;
    }
    
    private Vertex<T> vertex(T item){
        for(Vertex<T> vertex = head; vertex != null; vertex = vertex.nextV){
            if(vertex.item.compareTo(item)==0){
                return vertex;
            }
        }
        return null;
    }
    
    public boolean addVertex(T item){
        Vertex<T> newV = new Vertex<>(item);
        if(head == null){
            head=newV;
        } else{
                Vertex<T> temp = head;
                while(temp.nextV != null){
                    temp = temp.nextV;
                }
                temp.nextV = newV;
        }
        size++;
        return true;
    }
    
    public boolean addEdge(T src, T destination){
        Vertex<T> srcV = vertex(src);
        Vertex<T> destinationV = vertex(destination);
        
        if(srcV == null || destinationV == null){
            return false;
        }
        
        srcV.firstEdge = new Edge<>(destinationV, srcV.firstEdge);
        return true;
    }   
   
    public void printAdjacency(){
        for(Vertex<T> vertex = head; vertex != null; vertex= vertex.nextV){
            System.out.println(vertex.item);
            for(Edge<T> edge = vertex.firstEdge; edge!=null; edge=edge.nextEdge){
                System.out.println(" -> " + edge.toV.item);
            }
            System.out.println();
        }
    }
    
}

