import java.util.Scanner;

public class mathsGeometry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Calculate area of triangle
        System.out.print("Enter the base length of the triangle: ");
        double base = sc.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        double height = sc.nextDouble();

        double areaTriangle = 0.5 * base * height;
        System.out.println("Area of the triangle: " + areaTriangle);

        // Calculate volume of cube
        System.out.print("Enter the side length of the cube: ");
        double sideCube = sc.nextDouble();

        double volumeCube = Math.pow(sideCube, 3);
        System.out.println("Volume of the cube: " + volumeCube);

        // Calculate volume of cuboid
        System.out.print("Enter the length of the cuboid: ");
        double lengthCuboid = sc.nextDouble();
        System.out.print("Enter the width of the cuboid: ");
        double widthCuboid = sc.nextDouble();
        System.out.print("Enter the height of the cuboid: ");
        double heightCuboid = sc.nextDouble();

        double volumeCuboid = lengthCuboid * widthCuboid * heightCuboid;
        System.out.println("Volume of the cuboid: " + volumeCuboid);

        sc.close();
    }
}