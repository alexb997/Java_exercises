//Write a Java program to convert a binary number to a Octal number

import java.util.Scanner;

public class BinaryToOctal {
    public static void main(String[] args) {
        int binary_num;
        Scanner in = new Scanner(System.in);

        System.out.print("Input a Binary Number: ");
        binary_num = Integer.parseInt(in.nextLine(), 2);

        in.close();

        System.out.println("Resulted octal number: " + Integer.toOctalString(binary_num));
    }
}
