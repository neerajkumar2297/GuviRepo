package task7;
import java.io.File;
import java.io.FileNotFoundException;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the file name to read: ");
        String fileName = input.nextLine();

        try {
            // Attempt to open and read the file
            File file = new File(fileName);
            Scanner fileReader = new Scanner(file);

            System.out.println("File content:");
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                System.out.println(line);
            }

            // Close the file reader
            fileReader.close();
        } catch (FileNotFoundException e) {
            // Handle exception when the file is not found
            System.out.println("Error: The file '" + fileName + "' does not exist.");
        } finally {
            input.close();  // Close the scanner resource
        }

        System.out.println("Program execution continues after exception handling.");
    }
}
