class Book {
    private String author;
    private String name;
    private double price;
    public String publication;
    public int year;

    // Constructor that sets price only
    public Book(double price) {
        this.price = price;
    }

    // Setter for author
    public void setAuthor(String author) {
        this.author = author;
    }
    // Getter for author
    public String getAuthor() {
        return this.author;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }
    // Getter for name
    public String getName() {
        return this.name;
    }

    // Getter for price
    public double getPrice() {
        return this.price;
    }

    // Method to print book details
    public void printDetails() {
        System.out.println("Title: " + this.getName());
        System.out.println("Author: " + this.getAuthor());
        System.out.println("Publication: " + this.publication);
        System.out.println("Year: " + this.year);
        System.out.println("Price: " + this.getPrice());
    }
}

public class OOPEncapsulation {
    public static void main(String[] args) {
        // Create a Book object
        Book book1 = new Book(2200.22);
        book1.setAuthor("diwasbk");
        book1.setName("Principle of Physics");
        book1.publication = "Nepal Publication";
        book1.year = 2010;

        // Print details of the Book object
        book1.printDetails();
    }
}