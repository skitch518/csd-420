/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.module_8;
import java.util.Random;
/**
 *
 * @author jason
 */
public class RandomNumberStringBuffer {
    public static void main(String[] args) {
        // Create StringBuffer object
        StringBuffer randomNumbers = new StringBuffer();
        
        // Create Random object to generate random numbers
        Random random = new Random();
        
        int stringLength = 10000; // Create variable to set string length so it can be modified later
        
        // For loop to generate random numbers and append them to StringBuffer
        for (int i = 0; i < stringLength; i++) {
            int randomInt = random.nextInt(10);  // generate random number
            randomNumbers.append(randomInt); // add random letter to StringBuffer
        }

        // Print the resulting random string
        System.out.println("Random numbers: ");
        System.out.println(randomNumbers.toString());
        System.out.println();
    }
    
    // Thread class for random number generation
    public static class RandomNumberThread extends Thread {
        @Override
        public void run() {
            try {
                RandomNumberStringBuffer.main(new String[] {});       
            }  catch (Exception e) {
                System.out.println("Exception is caught: " + e.getMessage());
            }
        }
    }
}
