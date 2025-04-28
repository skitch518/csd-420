/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.module_8;

import java.util.Random;
/**
 * Jason Schriner
 * Module 8
 * 4/27/25
 */
public class Module_8 {

    public static void main(String[] args) {
                
      try {
            // Call random letter thread
            RandomLetterStringBuffer.RandomLetterThread letterThread = new RandomLetterStringBuffer.RandomLetterThread();
            letterThread.start();
            letterThread.join(); // Wait for letter thread to finish

            // Call random number thread
            RandomNumberStringBuffer.RandomNumberThread numberThread = new RandomNumberStringBuffer.RandomNumberThread();
            numberThread.start();
            numberThread.join(); // Wait for number thread to finish

            // Call random char thread
            RandomCharStringBuffer.RandomCharThread charThread = new RandomCharStringBuffer.RandomCharThread();
            charThread.start();
            charThread.join(); // Wait for char thread to finish

        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }
      
    } 
        
}
/**
 *  Had to wait for each thread to finish instead of running at the same time because the simple strings
 *  finished before the stringbuffers 
 */
