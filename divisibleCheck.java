import java.util.Scanner;

public class divisibleCheck {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter any number
        System.out.print("Enter any number: ");
        int num = sc.nextInt();
        sc.close();
        
        // Check if the number is divisible by both 5 and 11
        if (num % 5 == 0 && num % 11 == 0) {
            System.out.println("Divisible by 5 and 11.");
        } else {
            System.out.println("Not divisible by 5 and 11.");
        }
    }
}