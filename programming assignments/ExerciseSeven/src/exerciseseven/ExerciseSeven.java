/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciseseven;

import java.util.Scanner;

/**
 *
 * @author jenna schrader
 * this program is for programming assignment 7.1
 * it takes user input for a number of students
 * and then takes user input for scores
 * then assigns scores based on set rules 
 * and displays the assigned grades 
 * showcases single dimensional array
 */


// begin class 
public class ExerciseSeven {

    /**
     * @param args the command line arguments
     */
    // begin main
    public static void main(String[] args) {
        // create scanner
        Scanner input = new Scanner(System.in);
 
        System.out.print("Enter the number of students: ");
        int students = input.nextInt(); // get number of students
        
        double[] scores = new double[students]; // array to hold scores of students
        
        // get scores with for loop
        System.out.print("Enter the scores: ");
        for (int i = 0; i < students; i++) {
            scores[i] = input.nextDouble();
        }
        
        // intialize a var to hold the highest score
        double best = scores[0]; // start at beginning of array
        
        // iterate thru the array to get best score
        for (int i = 1; i < scores.length; i++) { 
            // if current another element is greater than current best
            if (scores[i] > best) { 
                // replace it with the best
                best = scores[i];
            } 
        }
        
        
        // figure out what the grade is for each student
        for (int i = 0; i < scores.length; i++) {
             double score = scores[i]; 
             char grade; // intialize a var to hold letter grade
            if (score >= best - 10) {
                grade = 'A';  
            } else if (score >= best - 20) {
                grade = 'B';
            } else if (score >= best - 30) {
                grade = 'C';
            } else if (score >= best - 40) {
                grade = 'D';
            } else {
                grade = 'F';
            }    
            
            // display the student, score, and grade
            System.out.println("Student " + (i + 1) + " scored " + score + " and grade is " + grade); 
        }
   
    }
    // end main
    
}
// end class
