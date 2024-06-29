public class breakContinue {
    public static void main(String[] args) {
        /*
        Initialize index variable to 1
        Loop from 1 to 20 with an increment of 2
        Skip the iteration if index is 5, 7, or 9
        Exit the loop if index is 17
         */
        for (int index = 1; index <= 20; index = index + 2) {
            if (index == 5 || index == 7 || index == 9) {
                // Skip iteration if index is 5, 7, or 9
                continue;
            } else if (index == 17) {
                // Exit the loop if index is 17
                break;
            }
            
            // Print the current value of index
            System.out.println(index);
        }
    }
}