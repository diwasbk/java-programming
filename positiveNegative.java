import java.util.Scanner;  

public class positiveNegative {  
    public static void main(String[] args) {  
        // Create a Scanner object to read input
        Scanner sc = new Scanner(System.in);  
        
        // Prompt the user to enter a number
        System.out.print("Enter any number: ");  
        int a = sc.nextInt();  
        sc.close();  

        // Check if the number is positive
        if (a > 0) {  
            System.out.println("The number is Positive.");  
        }
        // Check if the number is negative
        else if (a < 0) {  
            System.out.println("The number is Negative.");  
        }
        // If the number is neither positive nor negative, it must be zero
        else {  
            System.out.println("The number is Zero.");  
        }
    }
}
