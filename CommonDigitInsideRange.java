//Write a Java program that accepts two integer
// values between 25 to 75 and return true if there is a common digit in both numbers.

import java.util.Scanner;

public class CommonDigitInsideRange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the first number : ");
        int nr1 = in.nextInt();
        System.out.print("Input the second number: ");
        int nr2 = in.nextInt();
        in.close();
        System.out.println("Result: " + common_digit(nr1, nr2));
    }

    public static boolean common_digit(int nr1, int nr2) {
        if (nr1 < 25 || nr2 > 75)
            return false;
        int x = nr1 % 10;
        int y = nr2 % 10;
        nr1 /= 10;
        nr2 /= 10;
        return (nr1 == nr2 || nr1 == y || x == nr2 || x == y);
    }
}
