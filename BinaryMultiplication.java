// Write a Java program to result two binary numbers

import java.util.Scanner;

public class BinaryMultiplication {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input first binary number: ");
        long b1 = in.nextLong();
        System.out.print("Input second binary number: ");
        long b2 = in.nextLong();

        in.close();

        long result = 0;
        int digit, factor = 1;
        while (b2 != 0) {
            digit = (int) (b2 % 10);
            if (digit == 1) {
                b1 = b1 * factor;
                result = binaryproduct((int) b1, (int) result);
            } else {
                b1 = b1 * factor;
            }
            b2 = b2 / 10;
            factor = 10;
        }
        System.out.print("Product of two binary numbers: " + result + "\n");
    }

    static int binaryproduct(int b1, int b2) {
        int i = 0, remainder = 0;
        int[] sum = new int[20];
        int binary_prod_result = 0;

        while (b1 != 0 || b2 != 0) {
            sum[i++] = (b1 % 10 + b2 % 10 + remainder) % 2;
            remainder = (b1 % 10 + b2 % 10 + remainder) / 2;
            b1 = b1 / 10;
            b2 = b2 / 10;
        }
        if (remainder != 0) {
            sum[i++] = remainder;
        }
        --i;
        while (i >= 0) {
            binary_prod_result = binary_prod_result * 10 + sum[i--];
        }
        return binary_prod_result;
    }
}
