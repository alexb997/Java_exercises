//Write a Java program that takes two numbers as input and display the product of two numbers

import java.util.Scanner;

public class InputProduct {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input first number: ");
        int x = in.nextInt();

        System.out.print("Input second number: ");
        int y = in.nextInt();

        in.close();

        System.out.println(x + " * " + y + " = " + x * y);
    }
}
