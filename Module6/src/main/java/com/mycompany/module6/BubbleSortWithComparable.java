/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.module6;


public class BubbleSortWithComparable {
    
  public static <E extends Comparable<E>> void bubbleSort(E[] list) {
      int n = list.length; // Create variable to increase readability of for loop
      boolean swapped; // Use a boolean to identify if a swap was made
      
      /* Bubble sort ensures that the largest element is at the end of the array
      *  so we loop through decrementing n so that we don't check elements that are
      *  already sorted
      */ 
      for (int i = 0; i < n - 1; i++) {
        swapped = false; // set to false no swap made
            
        // Nested for loop that compares the two elements
        for (int j = 0; j < n - i - 1; j++) {
            // Use compare to method to compare the pointer with the following element
            if (list[j].compareTo(list[j + 1]) > 0) {
            // If the element is larger than the element after it swap positions
                E temp = list[j];
                list[j] = list[j + 1];
                list[j + 1] = temp;
                swapped = true;
                }
            }

            // If no elements were swapped, the list is already sorted
            if (swapped == false) break;
        }
  }
}

/*
* Bubble sort is a common technique for sorting so I was not sure how to make
* it different from the class example. I followed instructions from
* https://www.geeksforgeeks.org/bubble-sort-algorithm/ This exampple includes a boolean
* value to end sorting if no element is swappet to increase efficiency 
*/