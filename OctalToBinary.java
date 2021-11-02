// Write a Java program to convert a octal number to a binary number.

import java.util.Scanner;

public class OctalToBinary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Insert the octal number:");
        int decimal = Integer.parseInt(in.nextLine(), 8);
        in.close();
        System.out.println("Resulted binary number is: " + Integer.toBinaryString(decimal));
    }
}
