/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciseeight;

/**
 *
 * @author jensc
 * program that prompts user to enter 3x3 arrays of #s,
 * determines if they are identical,
 * and then displays the result
 */

import java.util.Scanner;

public class ExerciseEight {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // create scanner
        Scanner input = new Scanner(System.in);
        int m1[][] = new int[3][3]; // intialize 3x3 array
        System.out.println("Enter list 1: "); // prompt user
        
        // start loop to get columns and rows for 3x3 array
        for (int i = 0; i < 3; i++) { // row
            for (int j = 0; j < 3; j++) { // column
                m1[i][j] = input.nextInt();
                System.out.println(m1[i][j]);
            }
            
        }
       // repeat ^^^ for second 2nd array
        int m2[][] = new int[3][3];
        System.out.println("Enter list 2: ");
        
        for (int i = 0; i < 3; i++) { // row 
            for (int j = 0; j < 3; j++) { // column
                m2[i][j] = input.nextInt();
            }
            
        }
        
        // call equals method for m1 and m2 & assign to variable
        boolean equal = equals(m1, m2); 
        // if equals method returns true
        if (equal) {
            // print this
            System.out.println("The two arrays are identical");
        } else {
            // if false print this
            System.out.println("The two arrays are not identical");
        }
         
    }
    
    
    // pass arrays to method to process
    public static boolean equals(int[][] m1, int[][] m2) {
        // iterate through the elements to see if they are the same in both arrays
        
        for (int i = 0; i < m1.length; i ++) { // row 
            for (int j = 0; j < m1[i].length; j++) { // column
                // compare the elements in the arrays
                // if they dont match return false
                if ( m1[i][j] != m2[i][j]) { // comparing elements within loop
                    return false;
                }
            }
        }
        // if they match return true
        return true;
    }   
       
}
