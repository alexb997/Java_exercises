//Write a Java program to reverse a string

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Insert the string: ");
        String str= in.nextLine();
        in.close();
        StringBuilder strB= new StringBuilder();
        strB.append(str);
        System.out.print(strB.reverse());
    }
}
