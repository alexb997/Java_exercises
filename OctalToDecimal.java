//Write a Java program to convert a octal number to a decimal number

import java.util.Scanner;

public class OctalToDecimal {
    public static void main(String[] args) {
        int result;
        Scanner in = new Scanner(System.in);
        System.out.print("Insert the octal number: ");
        result = Integer.parseInt(in.nextLine(), 8);
        in.close();
        System.out.println("Resulted decimal is: " + result);
    }
}
