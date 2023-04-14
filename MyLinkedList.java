/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkedlist;

/**
 *
 * @author USER
 */
class MyLinkedList<E> {
    Node<E> head; //points to first node
    Node<E> tail; //points to last node
    int size; //keep track of number of element

    public MyLinkedList() {
    }
    
    //add data in first node
    public void addFirst(E e){
        Node<E> firstNode = new Node<>(e);
        firstNode.next = head; //create pointer to current head
        head = firstNode; //new node is head
        size++; //increase size of list
        if(tail==null){//no node
            tail= head;
        } 
    }
    
    //adding data in last link
    public void addLast(E e){
        if(tail == null){
            head = tail = new Node<>(e);
        }else{
            tail.next = new Node<>(e);
            tail = tail.next;
        }
        size++;
    }
    
    //add data in specific index position
    public void add(int index, E e){
        if(index==0){ //head == null
            addFirst(e);
        }else if(index >= size){ //index > size - 1 
            addLast(e);
        }else{
            Node<E> current = head;
            for(int i=1; i<index; i++){
                current = current.next;
            }
            Node<E> temp = current.next;
            current.next = new Node<>(e);
            (current.next).next = temp;
            size++;
        }
    }
    
    //remove first element
    public E removeFirst(){
        if(size==0){
            return null;
        }else{
            Node<E> temp = head;
            head = head.next;
            size--;
            if(head == null){
                tail=null;
            }
            return temp.e;
        }
    }
    
    //remove last element
    public E removeLast(){
        if(size==0){
            return null;
        }else if(size==1){
            Node<E> temp = head;
            head = tail = null;
            size = 0;
            return temp.e;
        }else{
            Node<E> current = head;
            for(int i =1; i<size-2; i++){
                current=current.next;
            }
            Node<E> temp = tail;
            tail = current;
            tail.next = null;
            size--;
            return temp.e;
        }
    }
    
    //remove element from specific index
    public E remove(int index){
        if(index<0 || index>= size){
            return null;
        }else if(index==0){
            return removeFirst();
        }else if(index >= size-1){
            return removeLast();
        }else{
            Node<E> prev = head;
            for(int i=1; i<index; i++){
                prev = prev.next;
            }
            Node<E> current = prev.next;
            prev.next = current.next;
            size--;
            return current.e;
        }
    }
    
    //print all elements in list
    public void print(){
        Node<E> current = head;
        while(current != null){
            System.out.print(current.e.toString() + " ");
            current = current.next;
        }
        System.out.println();
    }
    
    //reverse the list
    public void reverse(){
        Node<E> prev = null;
        Node<E> current = head;
        while(current != null){
            Node<E> next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        this.head = prev;
    }
    
    //see if list has value
    public boolean contains(E e){
        boolean found = false;
        Node<E> current = head;
        while(!found && current != null){
            if(current.e == e){
                found = true;
            }
            current = current.next;
        }
        return found;
    }
    
    public int getSize(){ //get size of linked list
        return size;
    }
    
    //get element value from list
    public E get(int index){
        Node<E> current = head;
        for(int i=0; i<index; i++){
            current = current.next;
        }
        return current.e;
    }
    
    //get first element in list
    public E getFirst(){
        if(size==0){
            return null;
        }
        return head.e;
    }
    //get last element in list
    public E getLast(){
        if(size==0){
            return null;
        }
        return tail.e;
    }
    //clear list
    public void clear(){
        while(size>0){
            removeLast();
        }
//        tail = null;
//        head = null;
//        size = 0;
    }
    //set value
    public E set(int index, E e){
        Node<E> current = head;
        
        if(index < 0 || index >= size){
            return null;
        }
        if(current == null){
            return null;
        }
        for(int i=0; i<index; i++){
            current = current.next;
        }
        E temp = current.e;
        current.e = e;
        return temp;
        
    }
    //return index of head
    public int indexOf(E e){
        int index = -1;
        Node<E> current = head;
        if(current != null){
            for(int i=0; i<size; i++){
                if((current.e).equals(e)){
                    index = i;
                    break;
                }
                current = current.next;
            }
        }
        return index;
    }
    //return index of tail
    public int lastIndexOf(E e){
        int index = 0;
        Node<E> current = tail;
        while(current != null){
            if(current == e){
                return index;
            }
            index++;
            current = current.next;
        }
        return -1;
    }
    //get middle value
    public E getMiddleValue(){
        int middle = size/2;
        Node<E> current = head;
        for (int i=0; i<middle; i++){
            current = current.next;
        }
        return current.e;
    }
}

