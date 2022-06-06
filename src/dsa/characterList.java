/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa;

import java.util.Comparator;

/** *
 * @author JiaWen
 * @param <E>
 */
public class characterList<E extends characteristic> {
    private Node<E> head, tail;
    private int size = 0;
    private int array[];

    public characterList() {
    }

    public characterList(Node<E> head, Node<E> tail) {
        this.head = head;
        this.tail = tail;
    }
    
    //addFirst
    public void addFirst(E e){
       Node<E> newNode = new Node<>(e);
       newNode.next = head;
       head = newNode;
       size++;
       if(tail == null)
           tail = head;
    }
    
    public void addLast(E e){
        if(tail == null){
            head = tail = new Node<>(e);
        }else{
            tail.next = new Node<>(e);
            tail = tail.next;
        }
        size++;
    }
    
    public void add(int index, E e){
        if(index == 0) addFirst(e);
        else if (index >= size) addLast(e);
        else{
            Node<E> current = head;
            for (int i = 1; i < index; i++)
                current = current.next;
            Node <E> temp = current.next;
            current.next = new Node<>(e);
            (current.next).next = temp;
            size++;
        }
    }
    
    //removeFirst
    public E removeFirst(){
        if(size == 0){
            return null;   //no node then return null
        }else{
            Node<E> tmp = head;    //copy head to temp node before delete
            head = head.next;   //set new head
            size--; //decrease the size
            if (head == null)
                tail = null;
            return tmp.element; //this is to know what we delete
        }  
    }
    
    public E removeLast(){
        if(size == 0)
            return null;
        else if(size == 1){
            Node<E> temp = head;
            head = tail = null;
            size = 0;
            return temp.element;
        }else{
            Node<E> current = head;
            for(int i = 0; i < size - 2; i++)
                current = current.next;
            Node<E> temp = tail;
            tail = current;
            tail.next = null;
            size--;
            return temp.element;
        }
    }
    
    public E remove(int index){
        if(index < 0 || index >= size)
            return null;
        else if(index == 0) 
            return removeFirst();
        else if(index == size - 1)
            return removeLast();
        else{
            Node<E> previous = head;
            for(int i = 1; i < index; i++){
                previous = previous.next;
            }
            Node<E> current = previous.next;
            previous.next = current.next;
            size--;
            return current.element;
        }
    }
    
    public boolean contains(E e){
        boolean result = false;     //declare result with boolean type and assign to false
        Node<E> current =  head;   //copy head to current node 
        for(int i = 0; i < size; i++){     //for loop
            if(current.element.equals(e)){  
                return true;
            }
            current = current.next;
        }
        return false;
    }
    
    public void clear(){
        size = 0;
        head = null;
        tail = null;
    }
    
    public int getSize(){
        return size;
    }
    
    public E getCharacter(String name){
        Node<E> current =  head;
        for(int i = 0; i < size; i++)
            if(current.element.equals(name))
                return current.element;
        return null;
    }
    
   public int[] toArray(int array[]){
       return array;
   }
   
   public int get(int index) throws IndexOutOfBoundsException {
        if (index >= size || index < 0)
            throw new IndexOutOfBoundsException("Illegal Index");
        return array[index];
    }
   
   

    public void display(){
        Node<E> current = head;
        for(int i = 0; i < size; i++){
            System.out.println(current.element + " ");
            System.out.println();
            current = current.next;
        }
    } 

}
