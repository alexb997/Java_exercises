// Write a Java program that accepts three integer
// values and return true if one of them is 20 or more and less than the substractions of others.

import java.util.Scanner;

public class IsTwentyOr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the first number : ");
        int nr1 = in.nextInt();
        System.out.print("Input the second number: ");
        int nr2 = in.nextInt();
        System.out.print("Input the third number : ");
        int nr3 = in.nextInt();
        System.out.println((Math.abs(nr1 - nr2) >= 20 || Math.abs(nr2 - nr3) >= 20 || Math.abs(nr3 - nr1) >= 20));
    }
}