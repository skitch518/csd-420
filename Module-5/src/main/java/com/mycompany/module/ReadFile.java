/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.module;

import java.util.*;
import java.io.*;

public class ReadFile {

    public static Set<String> readStringsFromFile(String filePath) {
        Set<String> words = new HashSet<>();  // Using HashSet to store words (no duplicates)

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Split the line by commas and/or spaces
                String[] parts = line.split("[,\\s]+"); // used java split method  

                // Add each word into the set
                for (String word : parts) {
                    if (!word.isBlank()) { // Skip any blank entries
                        words.add(word.trim().toLowerCase());  // Normalize words to lowercase
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }

        return words;
    }
}

/*
* I had trouble at first because what I was doing was reading each entire line and then working with a line as an element in
* the list. I initially tried a treeset and it may have worked if I had discovered that it was not the way I was sorting the list but
* the way I was sorting it. I was able to find the split method here https://www.w3schools.com/java/ref_string_split.asp to split the string in
* order to read individual words so that I was now sorting the words and not and entire string of words. 
*/