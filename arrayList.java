import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        /*
         * Make the following ArrayList names animals
         * ["Cat", "Dog", "Snake", "Tiger"]
         * Add the "Mouse" in the index 1
         * Remove the "Snake"
         * Replace "Tiger" with "Lion"
         * Replace "Mouse" with "Spider"
         * Note: With every add/remove print the array to know the new index
         */

        // Create an ArrayList named animals
        ArrayList<String> animals = new ArrayList<>();

        // Add initial elements to the ArrayList
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Snake");
        animals.add("Tiger");
        // Print the ArrayList after initial addition
        System.out.println("Direct Print: " + animals);

        // Add "Mouse" at index 1 and print the updated ArrayList
        animals.add(1, "Mouse");
        System.out.println("After adding Mouse at index 1: " + animals);

        // Remove "Snake" and print the updated ArrayList
        animals.remove("Snake");
        System.out.println("After removing Snake: " + animals);

        // Replace "Tiger" with "Lion" and print the updated ArrayList
        animals.set(3, "Lion");
        System.out.println("After replacing Tiger with Lion: " + animals);

        // Replace "Mouse" with "Spider" and print the updated ArrayList
        animals.set(1, "Spider");
        System.out.println("After replacing Mouse with Spider: " + animals);
    }
}