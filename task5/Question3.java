package task5;
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        
        // Initialize a variable to keep track of the numbers to print
        int num = 1;
        
        // Outer loop for each row
        for (int i = 1; i <= rows; i++) {
            // Inner loop for printing numbers in each row
            for (int j = 1; j <= i; j++) {
                System.out.print(num);
                num++; 
            }
            System.out.println();
        }
        
        scanner.close();
    }
}
