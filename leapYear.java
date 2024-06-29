import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter the year
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        sc.close();
        
        // Check if the year is a leap year using the leap year rules
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}