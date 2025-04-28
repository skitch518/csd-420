/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.module_8;
import java.util.Random;
/**
 * 
 * 
 */
public class RandomLetterStringBuffer {
    
    public static void main(String[] args) {
        // Create StringBuffer object
        StringBuffer randomLetters = new StringBuffer();
        
        // Create Random object to generate random objects
        Random random = new Random();
        
        int stringLength = 10000; // Create variable to set string length so it can be modified later
        
        // For loop to generate random characters and append them to StringBuffer
        for (int i = 0; i < stringLength; i++) {
            char randomLetter = (char) ('a' + random.nextInt(26)); // generate random letter 
            randomLetters.append(randomLetter); // add random letter to StringBuffer
        }

        // Print the resulting random string
        System.out.println("Random letters: ");
        System.out.println(randomLetters.toString());
        System.out.println();  
    }
    
    // Thread class for random letter generation
    public static class RandomLetterThread extends Thread {
        @Override
        public void run() {
            try {
                // Call random letter method
                RandomLetterStringBuffer.main(new String[] {});        
            } catch (Exception e) {
                System.out.println("Exception is caught: " + e.getMessage());
            } 
        }
    }
}
