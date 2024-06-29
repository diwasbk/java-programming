import java.util.Scanner;

public class gradeSwitch {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter student's grade
        System.out.print("Enter student's grade: ");
        String grade = sc.next();
        sc.close();
        
        // Convert the grade to uppercase for case-insensitive comparison
        grade = grade.toUpperCase();
        
        // Switch statement to determine GPA based on grade
        switch (grade) {
            case "A+":
                System.out.println("GPA: 4.0");
                break;
            case "A":
                System.out.println("GPA: 3.6");
                break;
            case "B":
                System.out.println("GPA: 3.0");
                break;
            case "C":
                System.out.println("GPA: 2.0");
                break;
            case "D":
                System.out.println("GPA: 1.0");
                break;
            case "F":
                System.out.println("GPA: 0.0");
                break;
            default:
                // Print message for invalid grade
                System.out.println("Invalid grade entered.");
                break;
        }
    }
}