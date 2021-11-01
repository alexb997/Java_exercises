//Write a Java program to convert a decimal number to hexadecimal number

import java.util.Scanner;

public class DecimalToHexa {
    public static void main(String[] args) {
        int nr, aux;
        String result = "";
        char hex[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };

        Scanner in = new Scanner(System.in);

        System.out.print("Input a decimal number: ");
        nr = in.nextInt();

        in.close();

        while (nr > 0) {
            aux = nr % 16;
            result = hex[aux] + result;
            nr = nr / 16;
        }
        System.out.print("Hexadecimal number is : " + result + "\n");
    }
}
