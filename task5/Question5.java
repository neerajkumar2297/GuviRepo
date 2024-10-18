package task5;

import java.util.Scanner;

public class Question5 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Input marks from the student
        
        System.out.println("Enter the marks: ");
        int marks = scanner.nextInt();
        
        System.out.println("The Grade scored is:");

        // Check if the input is valid (marks <= 100)
        if (marks > 100) {
            System.out.println("Invalid Input");
        } else if (marks >= 90) {
            System.out.println("A");
        } else if (marks >= 80) {
            System.out.println("B");
        } else if (marks >= 70) {
            System.out.println("C");
        } else if (marks >= 60) {
            System.out.println("D");
        } else if (marks >= 50) {
            System.out.println("E");
        } else {
            System.out.println("F");
        }
    }
}
