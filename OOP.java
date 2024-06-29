class Pen {
    // Instance variable to store the color of the pen
    String color;
    // Instance variable to store the type of the pen
    String type;

    // Method to print the type of the pen
    public void type() {
        System.out.println(this.type);
    }
    
    // Method to print the color of the pen
    public void color() {
        System.out.println(this.color);
    }
}

public class OOP {
    public static void main(String[] args) {
        // Creating an instance of Pen class and setting its attributes
        Pen pen1 = new Pen();
        pen1.color = "Red";
        pen1.type = "Ball Pen";
        
        // Calling methods to print the type and color of pen1
        pen1.type();
        pen1.color();

        // Creating another instance of Pen class and setting its attributes
        Pen pen2 = new Pen();
        pen2.color = "Blue";
        pen2.type = "Gel Pen";
        
        // Calling methods to print the type and color of pen2
        pen2.type();
        pen2.color();
    }
}
