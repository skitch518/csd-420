/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.schrinermodule2;

import java.util.Random;
/**
 * Jason Schriner
 * Module 2
 * 3/30/25
 */
public class SchrinerModule2 {
    
    public static void main(String[] args) {
        
        // Declare a variable array length so it can easily be changed later
        int arrayLength = 5;
        
        // Create an instance of the random class
        Random rand = new Random();
        
        // Declare the arrays
        int[] randomInt = new int[arrayLength];
        double[] randomDouble = new double[arrayLength];
        
        // Initialize random int with values
        for (int i = 0; i < arrayLength; i++){
            randomInt[i] = rand.nextInt(151);
        }
        
        // Initialize random double with values
        for (int d = 0; d < arrayLength; d++){
            randomDouble[d] = rand.nextDouble(151);
        }
        
        // Create the file
        CreateFile.createFile();
        
        
        // Write the randomInt and randDouble arrays to the file
        writeToFile.writeToFile(randomInt, randomDouble);
    }
}
