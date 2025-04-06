/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.readfile;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 *
 * @author jason
 */
public class ReadFile {

    public static void main(String[] args) {
      try {
            // Use an absolute path
            File myObj = new File("C:/csd/csd-420/Module-2/schrinerModule2/Schriner.dat");
            
            // Create Scanner to read file
            Scanner myReader = new Scanner(myObj);
            
            // Loop through file until last line is reached printing each line
            while (myReader.hasNextLine()){
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close(); // Close file
      } catch (FileNotFoundException e) {
          System.out.println("An error occurred.");
      }
    }
}