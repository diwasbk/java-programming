import java.util.Scanner;

public class vowelConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Prompt user to enter an alphabet
        System.out.print("Enter any alphabet: ");
        String alphabet = sc.nextLine();
        sc.close();
        
        // Check if the input alphabet is a vowel
        if (alphabet.equalsIgnoreCase("a") || alphabet.equalsIgnoreCase("e") || 
            alphabet.equalsIgnoreCase("i") || alphabet.equalsIgnoreCase("o") || 
            alphabet.equalsIgnoreCase("u")) {
            System.out.println("Vowel");
        } else {
            // If not a vowel, then it's a consonant
            System.out.println("Consonant");
        }
    }
}