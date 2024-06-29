import java.util.Scanner;

public class seasonDetermine {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input the month
        System.out.print("Enter the month (1 to 12): ");
        int month = sc.nextInt();

        sc.close();
        // Determine the season based on the month
        String season;
        switch (month) {
            case 1:
            case 2:
            case 3:
                season = "Winter";
                break;
            case 4:
            case 5:
            case 6:
                season = "Spring";
                break;
            case 7:
            case 8:
            case 9:
                season = "Summer";
                break;
            case 10:
            case 11:
            case 12:
                season = "Fall";
                break;
            default:
                season = "invalid";
                break;
        }
        
        // Print the corresponding season
        System.out.println("The season for month " + month + " is: " + season);
}
}