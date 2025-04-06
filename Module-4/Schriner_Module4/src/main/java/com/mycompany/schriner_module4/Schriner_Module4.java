/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.schriner_module4;

import java.util.Random;
import java.util.LinkedList;

/**
 *
 * Jason Schriner
 * Module 4
 * 4/6/25
 */
public class Schriner_Module4 {

    public static void main(String[] args) {
        
        // Create a linked list of integers
        LinkedList<Integer> exampleList = new LinkedList<>();
        
        // Create a random number generator object to easily add numbers to the list
        Random random = new Random();
        
        // Use a for each loop to add the numbers to the LinkedList
        for (int i = 0; i < 500000; i++){
            int randomNumber = random.nextInt(1000) + 1; // I prefer not using 0 and not having too many duplicates
            exampleList.add(randomNumber); // add the random number to the LinkedList
        
        }
        
        
        TraversalTime.traversalTimeWithGetIndex(exampleList);
        
        TraversalTime.travesalTimeWithIterator(exampleList);
    }
}

/**
 *
 * The get index took .65 seconds at 50k and 66 seconds at 500k
 * The iterator took .66 seconds at 50k and 66.8 seconds at 500k
 * The get index method is slightly faster meaning that for larger datasets
 * it becomes increasingly more efficient as the size increases. 
 * 
 * Note the 500k took over 2 minutes so at first I had thought I had made an error
 */