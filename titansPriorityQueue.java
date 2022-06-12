/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

/**
 * The design of this priorityQueue is such that all elements are added to a linkedlist
 * then, when dequeue is called, a for loop is used to search for the titan with the highest risk
 * @author Yap Yoong Siew
 */
public class titansPriorityQueue {
    LinkedList<Titans> oriqueue = new LinkedList<>();
   
    public titansPriorityQueue() {
    }
        
    public titansPriorityQueue(Titans[] arr) {
        Collections.addAll(oriqueue, arr);
    }
    
    public void enqueue(Titans e){
        oriqueue.add(e);
    }
    
    public Titans dequeue(){
        int risk = oriqueue.get(0).getRisk();//get the risk of the first element/titan in the list
        int riskIndex = 0; //keep track of the indexing
        for(int i = 0; i < oriqueue.size(); i++){//separate the 3 data types
            if(risk < oriqueue.get(i).getRisk()){//if the ith titan's risk is > current risk value
                risk = oriqueue.get(i).getRisk();//current risk value = the ith titan's risk value
                riskIndex = i;//the riskIndex will now point to the ith index
            }
        }
        return oriqueue.remove(riskIndex);//then remove the highest risk titan from the linkedlist
    }
    
    public Titans getElement(int i){
        return oriqueue.get(i);
    }
    
    public Titans peek(){
        return oriqueue.peek();
    }
    
    public int getSize(){
        return oriqueue.size();
    }
    
    public boolean contains(Titans e){
        return oriqueue.contains(e);
    }
    
    public boolean isEmpty(){
        return oriqueue.isEmpty();
    }

    @Override
    public String toString() {
        return "titansPriorityQueue{" + "oriqueue=" + oriqueue + '}';
    }

    
        
    
}
