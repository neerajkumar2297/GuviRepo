package task7;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            // Read first integer
            System.out.print("Enter the first number (dividend): ");
            int num1 = scanner.nextInt();
            
            // Read second integer
            System.out.print("Enter the second number (divisor): ");
            int num2 = scanner.nextInt();
            
            // Perform division
            int result = num1 / num2;
            
            // Display result
            System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
        } catch (ArithmeticException e) {
            // Handle division by zero
            System.out.println("Error: Division by zero is not allowed.");
        } catch (Exception e) {
            // Handle other exceptions
            System.out.println("Error: Invalid input.");
        } finally {
            scanner.close();  // Close the scanner resource
        }
    }
}
