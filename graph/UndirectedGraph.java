/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package graph;


/**
 *
 * @author USER
 */
public class UndirectedGraph {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create graph
        int V = 9;
        Graph<Character> g = new Graph<>();
        
        for(char c = 'A'; c<= 'I'; c++){
            g.addVertex(c);
        }
        g.addEdge('A', 'C');
        g.addEdge('A', 'D');
        g.addEdge('B', 'D');
        g.addEdge('C', 'E');
        g.addEdge('C', 'F');
        g.addEdge('D', 'E');
        g.addEdge('E', 'G');
        g.addEdge('F', 'H');
        g.addEdge('G', 'H');
        g.addEdge('H', 'I');
        g.printAdjacency();
        
    }
    
}
