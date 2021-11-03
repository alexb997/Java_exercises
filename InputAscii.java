//Write a Java program to print the ascii value of a given character

import java.util.Scanner;

public class InputAscii {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input character: ");
        char checked=in.next().charAt(0);
        in.close();
        int x=checked;
        System.out.println("Ascii code: "+ x);
    }
}
