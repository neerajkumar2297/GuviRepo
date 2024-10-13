package task4;

import java.util.Scanner;

public class Ouestion7 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String msg = scanner.nextLine();
        
        // Calculate the length of the string
        int length = msg.length();
        
       System.out.println("The length of the string \"" + msg + "\" is: " + length);
        
        scanner.close();
    }
}