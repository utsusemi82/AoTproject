/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa;

/**
 *
 * @author JiaWen
 * @param <E>
 */
public class Node<E> {
    E element;      //contains the element
    Node<E> next;      //make references
    Node<E> prev;

    public Node() {    //default constructor
    }

    public Node(E element) {       //constructor that receives a generic item
        this.element = element;
    }

    public Node(E element, Node<E> next, Node<E> prev) {     //initialise the variables
        this.element = element;
        this.next = next;
        this.prev = prev;
    }
    
}
