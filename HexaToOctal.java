//Write a Java program to convert a hexadecimal to a octal number

import java.util.Scanner;

public class HexaToOctal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Insert the hexadecimal number: ");
        int decimal = Integer.parseInt(in.nextLine(), 16);
        in.close();
        System.out.println("Resulted decimal: " + Integer.toOctalString(decimal));
    }
}