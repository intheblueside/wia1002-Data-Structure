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
public class BST<E extends Comparable> {
    
    TreeNode<E> root;
    int size;

    public BST() {
    }
    
    //searching for the node
    public boolean search(E e){
        TreeNode<E> current = root;
        while(current != null){
            if(e.compareTo(current.e)<0){
                current = current.left;     //if smaller go left
            }else if(e.compareTo(current.e)>0){
                current = current.right;    //if bigger go right
            }else{
                return true;    //else currently on the node aka equal
            }
        }
        return false;
    }
    //insert into tree
    public boolean insert(E e){
        //check if tree empty
        if(root == null){
            root = new TreeNode(e);
        }else{
            TreeNode<E> current = root;
            TreeNode<E> parent = root;
            while(current != null){ 
                if(e.compareTo(current.e)<0){//if input is less go left
                    parent = current;
                    current = current.left;
                }else if(e.compareTo(current.e)>0){ // if input is big go right
                    parent = current;
                    current = current.right;
                }else{
                    return false;
                }
            }
            if (e.compareTo(parent.e) < 0) {    //if smaller than parent insert in left
                parent.left = new TreeNode<>(e);
            }
            else {      //if bigger than parent insert in right
                parent.right = new TreeNode<>(e);
            }
        }
            
        size++; //increase size of tree
        return true;
    }
    //get size of tree
    public int getSize() {
        return size;
    }

    public int getHeight() {
        return height(root);    //call method height and pass root node
    }
    
    private int height(TreeNode<E> node){
        if(node == null){ //root is null means no tree, height = 0
            return -1;
        }else{
            int leftHeight = height(node.left); //recursive to find length in left and right
            int rightHeight = height(node.right);
            
            if(leftHeight > rightHeight){
                return leftHeight +1;
            }else{
                return rightHeight +1;
            }
        }
    }

    public E getRoot() {    //get root node value
        return this.root.e;
    }
    
    public E minValue(){ //most left value
        TreeNode<E> current = root;
        while(current.left != null){    //iterate until left no more
            current = current.left;
        }
        return current.e;
    }
    
    public E maxValue(){ //most right value
        TreeNode<E> current = root;
        while(current.right != null){   //iterate until right no more
            current = current.right;
        }
        return current.e;
    }
    
    public java.util.ArrayList<TreeNode<E>> path(E e){
        ArrayList<TreeNode<E>> list = new ArrayList<>();
        TreeNode<E> current = root;
        
        while(current != null){
            list.add(current);  //add root to first in list, and continue to add the upcoming current values
            if(e.compareTo(current.e)<0){   //compare next values if less than node
                current = current.left;
            }else if(e.compareTo(current.e)>0){ //compare next values if bigger than node
                current = current.right;
            }else{
                break;
            }
        }
        return list;
    }
    
    public boolean delete(E e){
        TreeNode<E> parent = null;
        TreeNode<E> current = root;
        
        while(current != null){
            if(e.compareTo(current.e)<0){
                parent = current;
                current = current.left;
            }else if(e.compareTo(current.e)>0){
                parent = current;
                current = current.right;
            }else{
                break;
            }
        }
        
        if(current == null){
            return false;
        }
        
        if(current.left == null){
            if(parent == null){
                root = current.right;
            }else{
                if(e.compareTo(parent.e)<0){
                    parent.left = current.right;
                }else{
                    parent.right = current.right;
                }
            }
        }else{
            TreeNode<E> parentRightMost = current;
            TreeNode<E> rightMost = current.left;
            
            while(rightMost.right != null){
                parentRightMost = rightMost;
                rightMost = rightMost.right;
            }
            current.e = rightMost.e;
            
            if(parentRightMost.right == rightMost){
                parentRightMost.right = rightMost.left;
            }else{
                parentRightMost.left = rightMost.left;
            }
        }
        size--;
        return true;
    }
    //make root null and size empty
    public boolean clear(){
        root = null;
        size = 0;
        return true;
    }
    //pass to inroder method
    public void inorder(){
        inorder(root);
    }
    
    protected void inorder(TreeNode<E> root){
        if(root != null){   //base, recursive method until root has no more value
            inorder(root.left); //start with left of root
            System.out.print(root.e + " "); // then root 
            inorder(root.right); //then right of root
        }
    }
    
    public void postorder(){
        postorder(root);
    }
    //recursive method for postorder
    protected void postorder(TreeNode<E> root){
        if(root != null){
            postorder(root.left);   //start with left of root
            postorder(root.right);  // continue with right
            System.out.print(root.e + " "); //finally print root
        }
    }
    
    public void preorder(){
        preorder(root);
    }
    //recursive method for preorder
    protected void preorder(TreeNode<E> root){
        if(root != null){
            System.out.print(root.e + " "); //start with root
            preorder(root.left);            //go to left
            preorder(root.right);           //go to right
        }
    }
}
