package task4;

import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter their age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        // Check if the person is a senior citizen (age 60 or older)
        if (age >= 60) {
            System.out.println("You are a senior citizen.");
        } else {
            System.out.println("You are not a senior citizen.");
        }
        
        scanner.close();
    }
}

