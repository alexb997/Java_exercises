//Write a Java program to convert a decimal number to octal number.

import java.util.Scanner;

public class DecimalToOctal {
    public static void main(String[] args) {
        int nr, aux, i = 1, j;
        int result[] = new int[100];
        Scanner in = new Scanner(System.in);

        System.out.print("Input a Decimal Number: ");
        nr = in.nextInt();

        in.close();

        aux = nr;

        while (aux != 0) {
            result[i++] = aux % 8;
            aux = aux / 8;
        }

        System.out.print("Octal number is: ");
        for (j = i - 1; j > 0; j--) {
            System.out.print(result[j]);
        }
        System.out.print("\n");
    }
}
