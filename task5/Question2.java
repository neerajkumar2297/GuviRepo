package task5;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        
        // Initialize an empty string to store the reversed string
        String reversedString = "";
        
        // Use a for loop to reverse the string
        for (int i = inputString.length() - 1; i >= 0; i--) {
            reversedString += inputString.charAt(i); // Append each character from the end
        }
        
        System.out.println("The reversed string is: " + reversedString);
        
        scanner.close();
    }
}
