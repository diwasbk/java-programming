import java.util.Scanner;

public class gradeCalculation {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner sc = new Scanner(System.in); 
        
        // Prompt the user to enter the marks of Physics
        System.out.print("Enter the marks of Physics: ");
        double phy = sc.nextDouble();
        
        // Prompt the user to enter the marks of Chemistry
        System.out.print("Enter the marks of Chemistry: ");
        double chem = sc.nextDouble();
        
        // Prompt the user to enter the marks of Maths
        System.out.print("Enter the marks of Maths : ");
        double maths = sc.nextDouble();
        
        // Close the scanner to release resources
        sc.close();
        // Calculate the total percentage
        double totalPercentage = (phy + chem + maths) / 300 * 100;
        
        // Format the totalPercentage to two decimal places
        String formattedPercentage = String.format("%.2f", totalPercentage);
        
        String grade;  // Declare a variable to store the grade

        if(phy<0 ||phy>100 || chem<0 || chem>100  ||maths<0 || maths>100){
            System.out.println("Invalid Marks");
        }else if (phy < 40 || chem < 40 || maths < 40) {
            grade = "Failed";
            System.out.println(grade);
        }else{
            // Determine the grade based on totalPercentage
            if (totalPercentage > 90 && totalPercentage <= 100) {
                grade = "A+";
            } else if (totalPercentage > 80 && totalPercentage <= 90) {
                grade = "A";
            } else if (totalPercentage > 70 && totalPercentage <= 80) {
                grade = "B+";
            } else if (totalPercentage >= 60 && totalPercentage <= 70) {
                grade = "B";
            } else {
                grade = "Pass";
            }  
            // Print congratulatory message if passed, otherwise print grade only
            if (totalPercentage >= 40) {
                System.out.println("\nCongratulations!");
                System.out.println("Total: " + formattedPercentage + "%");
                System.out.println("Grade: " + grade);
            } else {
                System.out.println("\nTotal: " + formattedPercentage + "%");
                System.out.println("Grade: " + grade);
            }
        }
    }
}