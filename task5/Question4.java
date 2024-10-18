package task5;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the number of rows (must be odd for symmetry)
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        
        // Check if the input is valid (odd number of rows)
        if (rows % 2 == 0) {
            System.out.println("Please enter an odd number.");
        } else {
            // Outer loop for each row
            for (int i = 0; i < rows; i++) {
                // Inner loop for each column in a row
                for (int j = 0; j < rows; j++) {
                    // Print stars in the diagonal pattern
                    if (i == j || i + j == rows - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                // Move to the next line after each row
                System.out.println();
            }
        }
        
        scanner.close();
    }
}
