package task4;

import java.util.Scanner;


public class Question4 {

	public static void main(String[] args) {
	      

		Scanner input = new Scanner(System.in);
		  
	        
		System.out.print("Enter the 1st number: ");
		        
		int number1 = input.nextInt();  
				        
				        
		System.out.print("Enter the 2nd number: ");
		        
		int number2 = input.nextInt();
	       
		System.out.println("Before swapping: 1st number = " + number1 + ", 2nd number = " + number2);
		 

		//Using temporary variable
		int temp = number1;
		        number1 = number2;
		        number2 = temp;
      
	        
		System.out.println("After swapping: 1st number = " + number1 + ", 2nd number = " + number2);
            

		input.close();
		    

		}

		}