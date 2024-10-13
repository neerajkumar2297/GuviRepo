package task4;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");

        int number = scanner.nextInt();

        // Initialize the factorial variable

        long factorial = 1;
        // Calculate factorial

        for (int i = 1; i <= number; i++) {
        factorial *= i;

        }   
	System.out.println(number + "! = " + factorial);
    scanner.close();


	}

}
