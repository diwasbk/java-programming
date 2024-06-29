import java.util.Random;
import java.util.Scanner;

public class miniProject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userInput;

        Random rand = new Random();
        // Generating a random integer between 0 and 100
        int randomNumber = rand.nextInt(101);

        do {
            // Prompt the user to guess a number
            System.out.print("Guess any number: ");
            userInput = sc.nextInt();
            
            // Check if the user input is out of the valid range
            if (userInput > 100) {
                System.out.println("Out of range");
                break;
            } else if (userInput > randomNumber) {
                // Provide feedback if the guess is too large
                System.out.println("Your guess is too large");
            } else if (userInput < randomNumber) {
                // Provide feedback if the guess is too low
                System.out.println("Your guess is too low");
            } else {
                // Display the correct number and a congratulatory message
                System.out.println("\nComputer >> Your guess >> " + randomNumber);
                System.out.println("Congratulations!\nYou guessed the right number!");
            }

        } while (userInput != randomNumber);
        // Close the scanner to release resources
        sc.close();
    }
}