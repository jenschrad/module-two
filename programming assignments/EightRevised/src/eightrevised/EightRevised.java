/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eightrevised;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author jensc
 * ex 8 revised to use ArrayList
 */
public class EightRevised {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create scanner
        Scanner input = new Scanner(System.in);
        
        // intialize arraylist m1
        ArrayList<ArrayList<Integer>> m1 = new ArrayList<>();
        
        // prompt user for values
        System.out.println("Enter list 1: ");
        for (int i = 0; i < 3; i++) {
            ArrayList<Integer> r1 = new ArrayList<>();
            for (int j = 0; j < 3; j++) {
                int value = input.nextInt();
                r1.add(value);
            }
            m1.add(r1);
        }
        
        // repeat ^^
        ArrayList<ArrayList<Integer>> m2 = new ArrayList<>();
        System.out.println("Enter list 2: ");
        for (int i = 0; i < 3; i++) {
            ArrayList<Integer> r2 = new ArrayList<>();
            for (int j = 0; j < 3; j++) {
                int value = input.nextInt();
                r2.add(value);
            }
            m2.add(r2);
        }
        
        // call method and display depending on what is returned
        boolean equal = equals(m1, m2);
        if (equal) {
            System.out.println("The two arrays are identical");
        } else {
            System.out.println("The two arrays are not identical");
        }
        
    }
    
    // compare arrays
     public static boolean equals(ArrayList<ArrayList<Integer>> m1, ArrayList<ArrayList<Integer>> m2) {
        for (int i = 0; i < m1.size(); i++) {
            ArrayList<Integer> r1 = m1.get(i);
            ArrayList<Integer> r2 = m2.get(i);

            if (!r1.equals(r2)) {
                return false;
            }
        } 
        return true;
    }
    
}
