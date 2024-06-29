import java.util.Scanner;

public class personalInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter their name
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        
        // Prompt the user to enter their age
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        
        sc.nextLine();  // Consume newline left-over
        
        // Prompt the user to enter their interest
        System.out.print("Enter your interest: ");
        String interest = sc.nextLine();

        // Close the scanner to release resources
        sc.close();

        // Display the collected information
        System.out.println("Hi! My name is " + name + ". I'm " + age + " years old, and I'm interested in " + interest + ".");
    }
}