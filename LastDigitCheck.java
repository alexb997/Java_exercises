//rite a Java program that accepts three integers from the user and
// return true if two or more of them (integers ) have the same rightmost digit.
// The integers are non-negative

import java.util.Scanner;

public class LastDigitCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the first number : ");
        int nr1 = in.nextInt();
        System.out.print("Input the second number: ");
        int nr2 = in.nextInt();
        System.out.print("Input the third number : ");
        int nr3 = in.nextInt();
        in.close();
        if ((nr1 % 10 == nr2 % 10) || (nr1 % 10 == nr3 % 10) || (nr2 % 10 == nr3 % 10)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
