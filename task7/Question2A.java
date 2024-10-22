package task7;

public class Question2A {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        
        try {
            // Access an invalid index in the array (out of bounds)
            System.out.println("Accessing index 5: " + numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle exception
            System.out.println("Error: Array index out of bounds.");
        }
        
        System.out.println("Program continues after exception handling.");
    }
}