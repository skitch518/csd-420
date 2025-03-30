/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.schrinermodule2;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author jason
 */
public class writeToFile {

    public static void writeToFile(int[] randomInt, double[] randomDouble){
        try{
            //Create file writer object set to true to append data
            FileWriter myWriter = new FileWriter("Schriner.dat", true);
            
            // Write the randomInt[] to the file
            myWriter.write("Integer values: \n");
            for (int i : randomInt){ // loop through each element of the array
                myWriter.write(i + "\n"); // write the element to the file
            }
            
           // Write the randomDoubles to the file
           myWriter.write("\nDouble values: \n");
           for (double d : randomDouble){ // loop through each element of the array
                myWriter.write(d + "\n"); // write the element to the file
            }
            
            myWriter.close(); // close the file
            System.out.println("Successfully wrote to file.");                    
        } catch (IOException e){
            System.out.println("An error occured");
        }
    }
}
