package task8;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import practice.WriteExcel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Task8 {

    private static final String FILE_PATH = "Utils//Student.xlsx";

    public static void main(String[] args) {

    	WriteExcel x= new WriteExcel();
        
    	x.writeToExcel("Sheet1", 0, 0, "Name");
    	x.writeToExcel("Sheet1", 1, 0, "John Doe");
		x.writeToExcel("Sheet1", 2, 0, "Jane Doe");
		x.writeToExcel("Sheet1", 3, 0, "Bob Smith");
		x.writeToExcel("Sheet1", 4, 0, "Swapnil");
    	
		x.writeToExcel("Sheet1", 0, 1, "Age");
		x.writeToExcel("Sheet1", 1, 1, "30");
		x.writeToExcel("Sheet1", 2, 1, "28");
		x.writeToExcel("Sheet1", 3, 1, "35");
		x.writeToExcel("Sheet1", 4, 1, "37");
    	
		x.writeToExcel("Sheet1", 0, 2, "Email");
    	x.writeToExcel("Sheet1", 1, 2, "john@test.com");
		x.writeToExcel("Sheet1", 2, 2, "jahn@test.com");
		x.writeToExcel("Sheet1", 3, 2, "jacky@example.com");
		x.writeToExcel("Sheet1", 4, 2, "swapnil@example.com");

            // 4. Read and print the data from the Excel file
            readDataFromExcel();

        
       
    }

    // Method to write data into an empty Excel file
    public static void writeDataToExcel(String data) {
        Workbook workbook = new XSSFWorkbook();  // Create a new workbook (for .xlsx files)
        Sheet sheet = workbook.createSheet("Sheet1");  // Create a sheet

        // 1. Create a row
        Row row = sheet.createRow(0);  // Row 0 (first row)

        // 2. Create a cell
        Cell cell = row.createCell(0);  // Column 0 (first column)
        cell.setCellValue(data);  // Set the retrieved data into the cell

        // 3. Write the workbook into an Excel file
        try (FileOutputStream fileOut = new FileOutputStream(FILE_PATH)) {
            workbook.write(fileOut);  // Write the workbook data to the Excel file
            System.out.println("Data written successfully to Excel file!");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                workbook.close();  // Close the workbook resource
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    // Method to read data from the Excel file and print the values
    public static void readDataFromExcel() {
        try (FileInputStream fileInputStream = new FileInputStream(FILE_PATH)) {
            Workbook workbook = new XSSFWorkbook(fileInputStream);  // Open the workbook
            Sheet sheet = workbook.getSheetAt(0);  // Get the first sheet

            // Loop through each row and cell to print data
            for (Row row : sheet) {
                for (Cell cell : row) {
                    // Print the cell value
                    switch (cell.getCellType()) {
                        case STRING:
                            System.out.print(cell.getStringCellValue()+" ");
                            break;
                        case NUMERIC:
                            System.out.print(+ cell.getNumericCellValue()+" ");
                            break;
                        case BOOLEAN:
                            System.out.print(cell.getBooleanCellValue()+" ");
                            break;
                        default:
                            System.out.print("Unknown Cell Type");
                    }
                    
                      }
                System.out.println("");
            }

            workbook.close();  // Close the workbook

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
