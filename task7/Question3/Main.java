package task7;

import java.util.Scanner;

public class Main {
    // Method to check if age is valid
    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age is less than 18. Access denied!");
        } else {
            System.out.println("Access granted. You are eligible.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();
            
            // Check the entered age
            checkAge(age);
        } catch (InvalidAgeException e) {
            // Handle the custom exception
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
