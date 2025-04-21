/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.module6;

/**
 * Created a student class to have a custom
 * object to use with the comparator
 */
public class Student {
   String name;
    int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public String toString() {
        return name + ": " + grade;
    } 
}
