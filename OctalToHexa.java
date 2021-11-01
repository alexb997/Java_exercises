//Write a Java program to convert a octal number to a hexadecimal number

import java.util.Scanner;

public class OctalToHexa {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Insert octal number: ");
        int decimal = Integer.parseInt(in.nextLine(), 8);
        in.close();
        System.out.println("Resulted hexadecimal number: " + Integer.toHexString(decimal));
    }
}
