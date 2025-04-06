/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.schriner_mod3_2;

import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author jason
 */
public class Schriner_Mod3_2 {

    public static void main(String[] args) {
        
        // Create an ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        
        // Create an object to generate random numbers
        Random random = new Random();
        
        // Utilize a for each loop to insert randomly generated numbers into ArrayList
        for (int i = 0; i< 50; i++){
            int randomNumber = random.nextInt(20) + 1; // generate random number and add 1 as 20 gives bounds of 0-19
            numbers.add(randomNumber); // add randomly generated number to next position in ArrayList
        }
        
        //Print original list
        System.out.println("Oringial List of numbers: " + numbers);
        
        
        // Utilize generic method to remove duplicates
        ArrayList<Integer> uniqueList = removeDuplicates.removeDuplicates(numbers);
        
        // Print the new list
        System.out.println("List after removing duplicates: " + uniqueList);
    }
    
}
