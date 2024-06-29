import java.util.Scanner;

public class conditionalStatement {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter their age
        System.out.print("Enter your age:");
        int age = sc.nextInt();
        sc.close();
        
        // Check if age is greater than 18 and print eligibility message
        if(age >= 18){
            System.out.println("Eligible to vote.");
        } else {
            System.out.println("Not eligible to vote.");
        }
    }
}