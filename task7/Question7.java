package task7;

import java.util.ArrayList;
import java.util.List;

public class Question7 {
    public static void main(String[] args) {
        // Create a List of Strings
        List<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Cherry");
        stringList.add("Date");

        // Convert the List to an Array
        String[] stringArray = stringList.toArray(new String[0]);

        // Print the Array
        System.out.println("Array elements:");
        for (String element : stringArray) {
            System.out.println(element);
        }
    }
}
