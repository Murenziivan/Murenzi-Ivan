/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class IOExceptionEx {
    public static void main(String[] args) {
        try {
            // Trying to read from a non-existent file
            BufferedReader reader = new BufferedReader(new FileReader("nonexistent.txt"));
            System.out.println(reader.readLine());
        } catch (IOException e) {
            // Handle the IOException
            System.out.println("IOException occurred: " + e.getMessage());
        }
    }
}