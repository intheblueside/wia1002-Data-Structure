/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bst;

import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class TestBST {

    public static void main(String[] args) {
        BST<Integer> tree = new BST<>();
        
        Integer[] input = new Integer[]{45, 88, 54, 76, 98, 1, 2, 20, 6, 53, 42, 100, 86, 32, 28, 65, 14 };
        
        System.out.println("Input data: ");
        for(Integer i : input){
            tree.insert(i);
            System.out.print(i + ", ");
        }
        System.out.println();
        
        System.out.println("Inorder (sorted): ");
        tree.inorder();
        
        System.out.println("\nPostOrder: ");
        tree.postorder();
        
        System.out.println("\nPreOrder: ");
        tree.preorder();
        
        System.out.println("\nHeight of BST: " + tree.getHeight());
        
        System.out.println("Root for BST is: " + tree.getRoot());
        
        System.out.println("Check whether 10 is in the tree? " + tree.search(10));
        
        System.out.println("Delete 53 ");
        tree.delete(53);
        
        System.out.println("Updated Inorder data (sorted): ");
        tree.inorder();
        
        System.out.println("\nMin Value: " + tree.minValue());
        
        System.out.println("Max Value: " + tree.maxValue());
        
        System.out.println("A path from the root to 6 is: ");
        ArrayList<TreeNode<Integer>> path = tree.path(6);
        for(TreeNode<Integer> node : path){
            System.out.print(node.e + " ");
        }
        
    }
    
}
