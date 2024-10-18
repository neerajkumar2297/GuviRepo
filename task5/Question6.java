package task5;
import java.util.Scanner;

public class Question6 {

    public static void main(String[] args) {
        // Create a scanner object for reading input
        Scanner scanner = new Scanner(System.in);
        
        // Input for month, room rent per day, and number of days
        
        System.out.print("Enter month no.: ");
        int month = scanner.nextInt();
        
        System.out.print("Enter room rent per day: ");
        double roomRentPerDay = scanner.nextDouble();
        
        System.out.print("Enter the no. of days: ");
        int numberOfDays = scanner.nextInt();
        
        // Variable to check if it's a peak season
        boolean isPeakSeason = false;

        // Switch case to determine if the given month falls in the peak season
        switch (month) {
            case 4: // April
            case 5: // May
            case 6: // June
            case 11: // November
            case 12: // December
                isPeakSeason = true;
                break;
            default:
                isPeakSeason = false;
                break;
        }

        // Calculate the room rent with peak season surcharge if applicable
        if (isPeakSeason) {
            roomRentPerDay += roomRentPerDay * 0.20; // Increase by 20%
        }

        // Calculate total tariff
        double totalTariff = roomRentPerDay * numberOfDays;

        // Print the total tariff with 2 decimal places
        System.out.printf("The hotel tariff to be paid " + "%.2f\n", totalTariff);
    }
}
