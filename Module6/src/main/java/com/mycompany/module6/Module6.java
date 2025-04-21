/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.module6;
import java.util.Arrays;
import java.util.Comparator;
/**
 * Jason Schriner
 * Module 6
 * 4/20/25
 */
public class Module6 {

    public static void main(String[] args) {
       
        System.out.println("Example of a bubble sort with the comparable method");
        
        // Create a random array with numbers that are unsorted
        Integer[] numbers = {5, 13, 4, 9, 0, 1, 12, 7, 10, 8, 6, 11, 3, 2, 14};

        // Use toString method to simplify printing the array
        System.out.println("Array before sorting: " + Arrays.toString(numbers));
        
        // Sort the array with the comparable method
        BubbleSortWithComparable.bubbleSort(numbers);
        
        // Print the results
        System.out.println("Array after sorting: " + Arrays.toString(numbers));
        
        System.out.println("Example of a bubble sort with the comparator method");
        
        // Initialize the student class with values
        Student[] students = {
            new Student("Robert", 22),
            new Student("Mike", 18),
            new Student("Janet", 25)
        };

        // Use the comparator to sort the student object based on their grades utilizing lambda expressions
        BubbleSortWithComparator.bubbleSort(students, Comparator.comparingInt(s -> s.grade));
        System.out.println("Sorted by grade: " + Arrays.toString(students));

        // Do the same thing but sort based on their name
        BubbleSortWithComparator.bubbleSort(students, Comparator.comparing(s -> s.name));
        System.out.println("Sorted by name: " + Arrays.toString(students));
        
        
    }
}

/*
* Used to string method from: https://www.geeksforgeeks.org/arrays-tostring-in-java-with-examples/
* referenced comparator and comparable from: https://www.w3schools.com/java/java_advanced_sorting.asp
*/