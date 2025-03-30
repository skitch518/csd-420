/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.schrinermodule2;

import java.io.File;
import java.io.IOException;
/**
 *
 * @author jason
 */
public class CreateFile {
    
    public static void createFile(){
        try {
            File myObj = new File("Schriner.dat"); // create file object
            // If the file does not exist make one
            if (myObj.createNewFile()){
              System.out.println("File created: " + myObj.getName());
            } else { // If it does exist print file already exists
                System.out.println("File already exists");
            }       
        } catch (IOException e){
            System.out.println("An error Occured");
        }
    }
}
