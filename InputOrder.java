//Write a Java program that accepts three integers from the user and return true if the second number
// is greater than first number and third number is greater than second number.
// If "abc" is true second number does not need to be greater than first number

import java.util.Scanner;

public class InputOrder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the first number : ");
        int nr1 = in.nextInt();
        System.out.print("Input the second number: ");
        int nr2 = in.nextInt();
        System.out.print("Input the third number : ");
        int nr3 = in.nextInt();
        System.out.print("The result is: " + test(nr1, nr2, nr3, true));
        System.out.print("\n");
    }

    public static boolean test(int nr1, int nr2, int nr3, boolean abc) {
        if (abc)
            return (nr3 > nr2);
        return (nr2 > nr1 && nr3 > nr2);
    }
}
