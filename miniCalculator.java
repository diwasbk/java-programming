import java.util.Scanner;

public class miniCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        // Consume the newline character left by nextInt()
        sc.nextLine();

        // Prompt the user to enter the operator
        System.out.print("Enter any operator: ");
        String operator = sc.nextLine();

        // Prompt the user to enter the second number
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        
        sc.close();

        // Perform calculations based on the operator provided
        switch (operator) {
            case "+":
                System.out.println("Addition: " + (num1 + num2));
                break;

            case "-":
                System.out.println("Subtraction: " + (num1 - num2));
                break;

            case "/":
                try {
                    System.out.println("Division: " + ((double) num1 / num2));
                } catch (Exception e) {
                    System.out.println("Error: " + e);
                }
                break;

            case "*":
                System.out.println("Multiplication: " + (num1 * num2));
                break;

            default:
                System.out.println("Invalid operator");
                break;
        }

    }
}