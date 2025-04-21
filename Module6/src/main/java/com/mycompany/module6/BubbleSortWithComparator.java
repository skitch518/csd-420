/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.module6;
import java.util.Comparator;
/**
 * Use the same logic as comparable however
 * we can decide how to compare the two elements
 * when we call the method
 */
public class BubbleSortWithComparator {
    
    public static <E> void bubbleSort(E[] list, Comparator<? super E> comparator) {
        int n = list.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (comparator.compare(list[j], list[j + 1]) > 0) {
                    E temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                    swapped = true;
                }
            }

            if (swapped == false) break;
        }
  
  }  
}
