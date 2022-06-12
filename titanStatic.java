/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa;


import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Yap Yoong Siew
 */
public class titanStatic {
    public static void main(String[] args){
        System.out.println("Enter the number of titans: ");
        Scanner in = new Scanner(System.in);
        int numberOfTitans = in.nextInt();
        System.out.println("Generating " + numberOfTitans + "Titans....");
        titansPriorityQueue priority = new titansPriorityQueue();
        //the linkedList is unsorted, the search for largest titan happens only when dequeue() is called
        for(int i = 0; i < numberOfTitans; i++){
            Titans curr = probability(i+1);
            System.out.println(curr.toString());
            priority.enqueue(curr);
        }
        System.out.println("pause");
        //the reason for this is to sort the queue with no additional space
        for(int i = 0; i < numberOfTitans; i++){
            priority.enqueue(priority.dequeue());
        }
        killSequence(priority);
    }
    
    public static Titans probability(int index){
        Random r = new Random();
        Titans titan;
        if(r.nextInt(101)>30){
            boolean normal = true;
            int height;
            double temp = r.nextDouble();//for height
            if(temp < 0.3){
                height = 1; //risk 1
            }
            else if(temp < 0.6){
                height = 2;//risk 2
            }
            else{
                height = 3;//risk 3
            }
            int legs;
            temp = r.nextDouble();//for legs
            if(temp < 0.3){
                legs = 1; //risk 1
            }
            else if(temp < 0.6){
                legs = 2; //risk 2
            }
            else{
                legs = 3; //risk 3
            }
            int speed;
            temp = r.nextDouble();//for speed
            if(temp < 0.3){
                speed = 1; //risk 1
            }
            else if(temp < 0.6){
                speed = 2; //risk 2
            }
            else{
                speed = 3;//risk 3
            }
            int walk;
            temp = r.nextDouble();//for walking pattern
            if(temp < 0.3){
                walk = 1; //risk 1
            }
            else if(temp < 0.6){
                walk = 2; //risk 2
            }
            else{
                walk = 3; //risk 3
            }
            int climb;
            temp = r.nextDouble();//for climb
            if(temp < 0.5){
                climb = 1; //risk 1
            }
            else{
                climb = 3; //risk 3
            }
            titan = new Titans(normal, height, legs, speed, walk, climb, index);
        }
        else{
            boolean normal = false;
            double temp = r.nextDouble();
            int risk;
            if(temp < 0.5){
                risk = 15;//abnormal
            }
            else{
                risk = 19;//one of nine
            }
            titan = new Titans(normal, risk, index);
        }
        return titan;
    }
    
    public static void killSequence(titansPriorityQueue e){
        System.out.println("Sequence to be killed :");
        int totalDistance = e.dequeue().getIndex(); //index of first titan
        System.out.print("Titan" + totalDistance); //totalDistance==index of fist titan   
        int size = e.getSize();
        for(int i = 0; i < size; i++){
            int n = e.dequeue().getIndex();
            totalDistance += n;
            System.out.print("--> Titan " + n);
        }
        System.out.println("");
        System.out.println("Total Distance moved : " + totalDistance);
    }
}

