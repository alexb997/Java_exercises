// Write a Java program to print the area and perimeter of a circle.

import java.util.Scanner;

public class RadiusToAreaAndPerim {
    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);
        System.out.println("Input the radius of the circle: ");
        double r = io.nextDouble();
        io.close();
        System.out.println("Perimeter is = " + (2 * r * Math.PI));
        System.out.println("Area is = " + (Math.PI * r * r));
    }
}