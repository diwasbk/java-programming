import java.util.Scanner;

public class doWhile {

    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner sc = new Scanner(System.in);
        // Declare variable num
        int num;
        
        // Execute the do-while loop until num is not greater than or equal to 0
        do {
            // Prompt the user to enter any number
            System.out.print("Enter any number: ");
            num = sc.nextInt();
        } while (num >= 0);  // Repeat the loop while num is greater than or equal to 0
        
        // Close the scanner to release resources
        sc.close();
    }
}