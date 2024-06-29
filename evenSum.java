import java.util.Scanner;

public class evenSum {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the number
        System.out.print("Enter the number: ");
        int evenNumbers = sc.nextInt();
        sc.close();
        
        // Initialize sum to calculate the sum of even numbers
        int sum = 0;
        
        // Loop through numbers from 1 to evenNumbers
        for (int i = 1; i <= evenNumbers; i++) {
            // Check if the number i is even
            if (i % 2 == 0) {
                // Add i to sum
                sum = sum + i;
                // Print the even number
                System.out.println(i);
            }
        }
        
        // Print the total sum of even numbers
        System.out.println("Sum: " + sum);
    }    
}