/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sevenrevised;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author jensc
 * revised program for ex seven using ArrayList 
 */
public class SevenRevised {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create scanner
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of students: ");
        int students = input.nextInt(); // get number of students
        
        ArrayList<Integer> scores = new ArrayList<>(); // create arraylist
        
        int best = Integer.MIN_VALUE;  // var for best
        
         // get scores with for loop
        System.out.print("Enter the scores: ");
        for (int i = 0; i < students; i++) {
            int score = input.nextInt();
            scores.add(score);  
            // change score if current element is greater than previous
            if (score > best) {
                best = score;
            }
        }
        
        for (int i = 0; i < scores.size(); i++) {
            int score = scores.get(i);
            char grade;
            
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
    
}
