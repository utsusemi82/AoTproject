/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

/**
 *
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
        int risk = oriqueue.get(0).getRisk();
        int riskIndex = 0;
        for(int i = 0; i < oriqueue.size(); i++){//separate the 3 data types
            if(risk < oriqueue.get(i).getRisk()){
                risk = oriqueue.get(i).getRisk();
                riskIndex = i;
            }
        }
        return oriqueue.remove(riskIndex);
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
