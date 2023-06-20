/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bst;

/**
 *
 * @author USER
 */
public class TreeNode<E extends Comparable> {
    
    E e;
    TreeNode<E> left;
    TreeNode<E> right;
    
    public TreeNode(E o){
        this.e=o;
    }
    
}
