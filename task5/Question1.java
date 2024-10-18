package task5;


import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        
        // Convert the string to lowercase to make the check case-insensitive
        String str = inputString.toLowerCase();
        
        // Initialize a flag to indicate if the string is a palindrome
        boolean isPalindrome = true;
        
        // Use a for loop to compare characters from start and end
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                isPalindrome = false; // If characters don't match, it's not a palindrome
                break; // Exit the loop early if a mismatch is found
            }
        }
        
        if (isPalindrome) {
            System.out.println("The string \"" + inputString + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + inputString + "\" is not a palindrome.");
        }
        
        scanner.close();
    }
}
