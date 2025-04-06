/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.schriner_module4;
import java.util.LinkedList;
import java.util.Iterator;

/**
 * Jason Schriner
 * Module 4
 * 4/6/25
 * 
 * Used iterator from example at W3school.om/java/java/iterator.asp
 */
public class TraversalTime {
    
    public static void travesalTimeWithIterator(LinkedList<Integer> list) {
             
       // Create Iterator object
       Iterator<Integer> it = list.iterator();
       
       // Measure time using nanoTime
       long startTime = System.nanoTime();
       
       while (it.hasNext()){
           it.next();
       }
        
       // Traverse the LinkedList using get(index)
       for (int i = 0; i < list.size(); i++) {
           list.get(i); 
       } 
       
       // Get the end time
       long endTime = System.nanoTime();
       
       // Calculate the duration
       long duration = endTime - startTime;
       
       // Print duration
       System.out.println("It took: " + duration + " to traverse with iteration");
     
     
    }
     
    public static void traversalTimeWithGetIndex (LinkedList<Integer> list){
       
        // Measure time using nanoTime
        long startTime = System.nanoTime();
        
        // Traverse the LinkedList using get(index)
        for (int i = 0; i < list.size(); i++) {
           list.get(i); 
        } 
        
        // Get the end time
        long endTime = System.nanoTime();
       
        // Calculate the duration
        long duration = endTime - startTime;
        
        // Print duration
       System.out.println("It took: " + duration + " to traverse with getIndex");
   
    }
    
}
