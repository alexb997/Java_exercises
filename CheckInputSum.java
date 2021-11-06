// Write a Java program to calculate the sum of two integers and return true if the sum is equal to a third integer

import java.util.Scanner;

public class CheckInputSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the first number : ");
        int nr1 = input.nextInt();
        System.out.print("Input the second number: ");
        int nr2 = input.nextInt();
        System.out.print("Input the third number : ");
        int nr3 = input.nextInt();
        input.close();
        if ((nr1 + nr2) == nr3 || (nr1 + nr3) == nr2 || (nr2 + nr3) == nr1) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }
}
