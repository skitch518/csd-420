/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.module;
import java.util.*;


/**
 * Jason Schriner
 * Module 5
 * 4/13/25
 */
public class Module5 {

    public static void main(String[] args) {
        
        // In my IDE I could not get it to work without the absolute path
        // So I did this instead of storing the file in the same directory and
        // using a relative path
        String path = "C:\\csd\\csd-420\\Module-5\\collection_of_words.txt"; 
        Set<String> wordSet = ReadFile.readStringsFromFile(path);

        // Convert Set to List so I can use the java collections sort() method
        List<String> sortedWords = new ArrayList<>(wordSet);
        Collections.sort(sortedWords);  // Sorts the list

        System.out.println("Sorted words from the file (A to Z):");
        for (String word : sortedWords) { // Loop through the list
            System.out.print(word + " "); // print each element in the list
        }

        System.out.println("\nReverse sorted words from the file (Z to A):");
        Collections.reverse(sortedWords);  // Reverse the list
        for (String word : sortedWords) { // Loop through the list
            System.out.print(word + " "); // print each element in the list
        }
        
        /**
         *  If you did not want me to use the collections sort method I would still
         *  convert the set to an ArrayList and then use bubble sort to order the elements
         *  alphabetically and then to print them in reverse order I would just print them based on index
         *  positions starting with the last index and do i--
         */
    }
}
