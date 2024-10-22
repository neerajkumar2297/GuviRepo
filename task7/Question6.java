package task7;

import java.util.Map;
import java.util.TreeMap;

public class Question6 {
    public static void main(String[] args) {
        // Create a TreeMap to store employee IDs and names
        TreeMap<Integer, String> employeeMap = new TreeMap<>();

        // Add some employees to the TreeMap (ID, Name)
        employeeMap.put(101, "John");
        employeeMap.put(102, "Alice");
        employeeMap.put(103, "Bob");
        employeeMap.put(104, "Eve");
        employeeMap.put(105, "Charlie");

        // Print employee names in alphabetical order
        System.out.println("Employee Names in Alphabetical Order:");
        
        // Since values are stored as names, we just need to sort the values
        employeeMap.values()
            .stream()
            .sorted()  // Sort the employee names
            .forEach(System.out::println);  // Print each employee name
    }
}
