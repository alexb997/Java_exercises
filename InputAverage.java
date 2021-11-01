//Write a Java program that takes three numbers as input to calculate and print the average of the numbers.

import java.util.Scanner;

public class InputAverage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input first number: ");
        int x = in.nextInt();

        System.out.print("Input second number: ");
        int y = in.nextInt();

        System.out.print("Input third number: ");
        int z = in.nextInt();

        in.close();

        System.out.println("Average is: " + (x + y + z) / 3);
    }
}
