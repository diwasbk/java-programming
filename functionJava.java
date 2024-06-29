import java.util.Scanner;

public class functionJava {
    // Define a method named myFunction
    public static void myFunction(){
        // Create a Scanner object to read input
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter their name
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        
        // Print a greeting message with the entered name
        System.out.println("Hello! " + name);
        
        // Close the scanner to release resources
        sc.close();
    }
    public static void main(String[] args) {
        myFunction();  // Call the myFunction method
    }
}