import java.util.Scanner;

public class maxNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        // Prompt the user to enter the second number
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // Prompt the user to enter the third number
        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        sc.close();

        // Determine the maximum number among the three numbers
        if (a >= b && a >= c) {
            if (a == b && b == c) {
                System.out.println("All numbers are equal: " + a);
            } else {
                System.out.println("Maximum number is " + a);
            }
        } else if (b >= a && b >= c) {
            if (b == a && a == c) {
                System.out.println("All numbers are equal: " + b);
            } else {
                System.out.println("Maximum number is " + b);
            }
        } else {
            if (c == a && a == b) {
                System.out.println("All numbers are equal: " + c);
            } else {
                System.out.println("Maximum number is " + c);
            }
        }
    }
}