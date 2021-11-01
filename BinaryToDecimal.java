//Write a Java program to convert a binary number to decimal number.

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input first binary number: ");
        long binary_num = in.nextLong();

        in.close();

        long decimal_num = 0, j = 1, rest;

        while (binary_num != 0) {
            rest = binary_num % 10;
            decimal_num = decimal_num + rest * j;
            j = j * 2;
            binary_num = binary_num / 10;
        }
        System.out.println("Decimal Number: " + decimal_num);
    }

}
