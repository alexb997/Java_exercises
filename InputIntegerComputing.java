//Write a Java program that accepts an integer (n) and computes the value of n+nn+nnn

import java.util.Scanner;

public class InputIntegerComputing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the number:");
        int nr = in.nextInt();
        in.close();
        System.out.printf("%d + %d%d  + %d%d%d\n", nr, nr, nr, nr, nr, nr);
    }
}
