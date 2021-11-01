// Write a Java program to print the area and perimeter of a rectangle.

import java.util.Scanner;

public class RectangleAriaAndPerim {
    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);
        System.out.println("Input the width of the rectangle: ");
        double width = io.nextDouble();
        System.out.println("Input the height of the rectangle: ");
        double height = io.nextDouble();
        io.close();

        System.out.println("Perimeter is = " + (2 * (height + width)));
        System.out.println("Area is = " + (width * height));
    }
}
