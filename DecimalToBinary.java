// Write a Java program to convert a decimal number to binary number.

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input decimal number: ");
        int nr = in.nextInt();

        in.close();

        int result[] = new int[100];
        int aux = nr, i = 1, j;

        while (aux != 0) {
            result[i++] = aux % 2;
            aux = aux / 2;
        }

        System.out.print("Binary number is: ");
        for (j = i - 1; j > 0; j--) {
            System.out.print(result[j]);
        }
    }
}
