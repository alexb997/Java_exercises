//Write a Java program to add two binary numbers.

import java.util.Scanner;

public class BinaryAddition {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input first binary number: ");
        long b1 = in.nextLong();
        System.out.print("Input second binary number: ");
        long b2 = in.nextLong();

        in.close();
        int i = 0, rest = 0;
        int[] sum = new int[20];
        while (b1 != 0 || b2 != 0) {
            sum[i++] = (int) ((b1 % 10 + b2 % 10 + rest) % 2);
            rest = (int) ((b1 % 10 + b2 % 10 + rest) / 2);
            b1 = b1 / 10;
            b2 = b2 / 10;
        }
        if (rest != 0) {
            sum[i++] = rest;
        }
        --i;
        System.out.print("Sum of two binary numbers: ");
        while (i >= 0) {
            System.out.print(sum[i--]);
        }
        System.out.print("\n");
    }
}
