package task4;
import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        // Check if the number is even using the % operator
        if (number % 2 == 0) {
            System.out.println(number + " is an even number.");
        } else {
            System.out.println(number + " not an even number.");
        }

        input.close();
    }

	}


