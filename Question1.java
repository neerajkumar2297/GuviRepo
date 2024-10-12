package task4;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) 
	{
	
		try (Scanner input = new Scanner(System.in)) {
			System.out.print("Enter value for a: ");
			int a = input.nextInt();
			
			System.out.print("Enter value for b: ");
			int b = input.nextInt();
			
			System.out.print("Enter value for c: ");
			int c = input.nextInt();
			
			System.out.print("Enter value for : ");
			int d = input.nextInt();

			// Calculate the sums
			        
			int sumAB = a + b;	        
			int sumCD = c + d;

			        
			// Check if the sum of a and b is greater than the sum of c and d or otherwise
			        
			if (sumAB > sumCD) {
			            
			       
			System.out.println("The sum of a and b is greater than the sum of c and d.");
			 
			} else {
				System.out.println("The sum of c and d is greater than the sum of a and b.");
			}
			    
			input.close();
		}

	}
	}