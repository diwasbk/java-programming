import java.util.*;

public class arraySeperation {
    public static void main(String[] args) {
        /*
        Make a ArrayList animals
        ["Cat", "Tiger", "Dog", "Snake", "Elephant"]
        Make another two ArrayList>> wildAnimals and domesticAnimals
        Loop the animals
        Add the animals according to their respected list
        Print animals
        Print both wildAnimal and domesticAnimal 
        */

        // Create an ArrayList named animals with initial values
        ArrayList<String> animals = new ArrayList<>(Arrays.asList("Cat", "Tiger", "Dog", "Snake", "Elephant"));
        // Print the original ArrayList
        System.out.println("Original Array: " + animals);

        // Create two new ArrayLists for wild and domestic animals
        ArrayList<String> domesticAnimal = new ArrayList<>();
        ArrayList<String> wildAnimal = new ArrayList<>();

        int len = animals.size();  // Get the size of the animals ArrayList
        // Loop through each element in animals
        for (int i = 0; i <= len - 1; i++) {
            if (animals.get(i).equals("Cat") || animals.get(i).equals("Dog")) {
                // If the animal is domestic, add it to domesticAnimal ArrayList
                domesticAnimal.add(animals.get(i));
            } else {
                // Otherwise, add it to wildAnimal ArrayList
                wildAnimal.add(animals.get(i));
            }
        }
        // Print the ArrayList of domestic animals
        System.out.println("Domestic Animals: " + domesticAnimal);
        // Print the ArrayList of wild animals
        System.out.println("Wild Animals: " + wildAnimal);
    }
}