import java.util.Scanner;

public class simpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input principle amount
        System.out.print("Enter Principle: ");
        float p = sc.nextFloat();
        
        // Input time period
        System.out.print("Enter Time: ");
        float t = sc.nextFloat();
        
        // Input rate of interest
        System.out.print("Enter Rate: ");
        float r = sc.nextFloat();

        // Close the scanner to release resources
        sc.close();
        
        // Calculate simple interest
        float si = (p * t * r) / 100;
        
        // Display the calculated simple interest
        System.out.println("Simple Interest: " + si + "%");
    }
}