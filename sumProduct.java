import java.util.Scanner;

public class sumProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input first number
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        // Input second number
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        
        // Close the scanner to release resources
        sc.close();
        
        // Calculate and print the sum of the two numbers
        System.out.println("Sum of two numbers: " + (a + b));
        
        // Calculate and print the product of the two numbers
        System.out.println("Product of two numbers: " + (a * b));
    }
}