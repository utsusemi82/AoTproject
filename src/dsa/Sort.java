/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsa;

/**
 *
 * @author JiaWen
 */
//Bubble sort (descending)
public class Sort{
    public void bubbleSort(int[] arr) {  
        int n = arr.length;  
        int temp = 0;  
        for(int i=0; i < n; i++){  
            for(int j=1; j < (n-i); j++){  
                if(arr[j-1] > arr[j]){  
                //swap elements  
                    temp = arr[j-1];  
                    arr[j-1] = arr[j];  
                    arr[j] = temp;  
                }  
            }     
        }  
    }  
    
//Binary search
public static int binarySearch(int[] list, int key){
    int low = 0;
    int high = list.length - 1;
    
    while(high >= low){
        int mid = (low + high)/2 ;
        if(key < list[mid])
            high = mid - 1;
        else if(key == list[mid])
            return mid;
        else
            low = mid + 1;
    }
    return -1 - low ;
}
    
    
    
        
       
        
        
    
}
