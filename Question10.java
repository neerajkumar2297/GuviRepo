package task4;

import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        
        // Initialize the digit counter
        int count = 0;
        
        // Make the number positive for counting digits in negative numbers
        int temp = Math.abs(number);
        
        // Count the digits
        if (temp == 0) {
            count = 1; // Special case for 0, as it has 1 digit
        } else {
            while (temp > 0) {
                temp /= 10; // Remove the last digit
                count++;    // Increment the digit counter
            }
        }
        
        // Print the number of digits
        System.out.println("The number " + number + " has " + count + " digits.");
        
        scanner.close();
    }
}
