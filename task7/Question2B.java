package task7;

public class Question2B {
    public static void main(String[] args) {
        String text = "Hello, World!";
        
        try {
            // Access an invalid index in the string (out of bounds)
            System.out.println("Character at index 20: " + text.charAt(20));
        } catch (StringIndexOutOfBoundsException e) {
            // Handle exception
            System.out.println("Error: String index out of bounds.");
        }
        
        System.out.println("Program continues after exception handling.");
    }
}
