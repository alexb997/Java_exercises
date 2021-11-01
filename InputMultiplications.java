// Write a Java program that takes a number as input and prints its multiplication table up to 10.

import java.util.Scanner;

public class InputMultiplications {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input first number: ");
        int x = in.nextInt();

        in.close();

        for (int i = 1; i <= 10; i++) {
            System.out.println(x + " * " + i + " = " + (x * i));
        }
    }
}
