//Write a Java program to find the number of 
//integers within the range of two specified numbers and that are divisible by another number
//For example x = 5, y=20 and p =3, 
//find the number of integers within the range x..y and that are divisible by p i.e. { i :x ≤ i ≤ y, i mod p = 0 }

import java.util.Scanner;

public class NumbersInRangeDivisibleBy {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the first number : ");
        int nr1 = in.nextInt();
        System.out.print("Input the second number: ");
        int nr2 = in.nextInt();
        System.out.print("Input the third number : ");
        int nr3 = in.nextInt();
        in.close();
        System.out.println(check(nr1, nr2, nr3));
    }

    public static int check(int nr1, int nr2, int nr3) {
        if (nr1 % nr3 == 0)
            return (nr2 / nr3 - nr1 / nr3 + 1);
        return (nr2 / nr3 - nr1 / nr3);
    }
}
