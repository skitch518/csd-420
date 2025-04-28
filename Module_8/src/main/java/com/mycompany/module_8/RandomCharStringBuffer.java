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
public class RandomCharStringBuffer {
    
    public static void main(String[] args) {
    
       // Create StringBuffer object
        StringBuffer randomCharacters = new StringBuffer();

        // Define special characters
        String specialCharacters = "!@#$%^&*()_+-=[]{}|;:,.<>?";

        // Create Random object to generate random characters
        Random random = new Random();

        // Length of the random string
        int stringLength = 10000;

        // For loop to generate random characters and append them to StringBuffer
        for (int i = 0; i < stringLength; i++) {
            // Generate a random character from the specialCharacters string
            char randomChar = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
            
            // Append the random character to the StringBuffer
            randomCharacters.append(randomChar);
        }

        // Print the resulting random string of special characters
        System.out.println("Random Characters: ");
        System.out.println(randomCharacters.toString());
        System.out.println();
    }
    
    // Thread class for random character generation
    public static class RandomCharThread extends Thread {
        @Override
        public void run() {
            try {
                RandomCharStringBuffer.main(new String[] {});
            } catch (Exception e) {
                System.out.println("Exception is caught: " + e.getMessage());
            } 
        }
    }
}

