//Write a Java program to convert a binary number to hexadecimal number

import java.util.Scanner;

public class BInaryToHexa {
    public static void main(String[] args) {

        int[] hex = new int[1000];
        int i = 1, j = 0, rem, dec = 0, binary_num;

        Scanner in = new Scanner(System.in);
        System.out.print("Input a Binary Number: ");
        binary_num = in.nextInt();

        in.close();

        while (binary_num > 0) {
            rem = binary_num % 2;
            dec = dec + rem * i;
            i = i * 2;
            binary_num = binary_num / 10;
        }
        i = 0;
        while (dec != 0) {
            hex[i] = dec % 16;
            dec = dec / 16;
            i++;
        }
        System.out.print("HexaDecimal value: ");
        for (j = i - 1; j >= 0; j--) {
            if (hex[j] > 9) {
                System.out.print((char) (hex[j] + 55) + "\n");
            } else {
                System.out.print(hex[j] + "\n");
            }
        }
    }
}
