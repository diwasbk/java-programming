import java.util.Scanner;

public class areaCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a shape case
        System.out.print("Enter any case: ");
        String shape = sc.nextLine();

        // Switch statement to handle different shape cases
        switch (shape) {
            // Case for Circle
            case "C":
                // Prompt the user to enter the radius
                System.out.print("Enter radius: ");
                int radius = sc.nextInt();

                // Calculate and print the area of the circle
                System.out.println("Area of circle: " + (3.14 * Math.pow(radius, 2)));
                break;

            // Case for Rectangle
            case "R":
                // Prompt the user to enter the length
                System.out.print("Enter length: ");
                int l = sc.nextInt();
                // Prompt the user to enter the breadth
                System.out.print("Enter breadth: ");
                int b = sc.nextInt();

                // Calculate and print the area of the rectangle
                System.out.println("Area of rectangle: " + (l * b));
                break;

            // Case for Square
            case "S":
                // Prompt the user to enter the side length
                System.out.print("Enter length: ");
                int a = sc.nextInt();

                // Calculate and print the area of the square
                System.out.println("Area of square: " + (a * a));
                break;

            // Case for Triangle
            case "T":
                // Prompt the user to enter the base
                System.out.print("Enter base: ");
                int base = sc.nextInt();
                // Prompt the user to enter the height
                System.out.print("Enter height: ");
                int height = sc.nextInt();
                
                // Calculate and print the area of the triangle
                System.out.println("Area of triangle: " + (base * height) / 2);
                break;

            // Default case for invalid input
            default:
                // Print an error message for invalid shape case
                System.out.println("Wrong case.");
                break;
        }

        // Close the scanner to avoid resource leak
        sc.close();
    }
}