public class arrayLoop {
    // Method to print the array in original order
    public static void orginalOrder(){
        int [] myArray = {20, 40, 60, 80, 100, 120};
        // Print the array in order using a loop
        for(int i=0;i<=myArray.length-1;i++){
            System.out.println(myArray[i]);
        }
    }

    // Method to print the array in reverse order
    public static void reverseOrder(){
        int [] myArray = {20, 40, 60, 80, 100, 120};
        // Reverse Order
        for(int i = myArray.length-1;i>0;i--){
            System.out.println(myArray[i]);
        }
    }

    // Method to print each element of the array as its negative counterpart
    public static void positiveArray(){
        int [] myArray = {-10, -20, -30, -40, -50};
        for(int i=0; i<=myArray.length-1; i++){
            // Negative to Positive Array
            System.out.println(myArray[i]*-1);
        }
    }

    // Main method to demonstrate each function
    public static void main(String[] args) {
        System.out.println("\nOrderwise:");
        orginalOrder();  // Call method to print array in original order

        System.out.println("\nReverse Order:");
        reverseOrder();  // Call method to print array in reverse order

        System.out.println("\nNegative to Positive Array:");
        positiveArray();  // Call method to print array elements as positives of their negatives
    }
}