/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.schriner_mod3_2;

import java.util.ArrayList;

/**
 *
 * Jason Schriner
 * Module 3.2
 * 4/6/25
 */
public class removeDuplicates {
    
    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
    
        // Create a new ArrayList to contain the new list
        ArrayList<E> newList = new ArrayList<>();
    
        // Use a for loop to check to see if each element is already in the list
        for (E element : list){
            // Is the element not already in the list
            if (!newList.contains(element)){
                newList.add(element); // add the element to the list
            }
        
        }
        
        return newList; // Return newly created list
    }
}
