//Write a Java program to swap two variables

import java.util.Scanner;

public class SwapVar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input first number: ");
        int x = in.nextInt();

        System.out.print("Input second number: ");
        int y = in.nextInt();

        in.close();

        System.out.println("Before Swap: x=" + x + "; y=" + y + ';');

        int aux = x;
        x = y;
        y = aux;

        System.out.println("After Swap: x=" + x + "; y=" + y + ';');
    }
}
