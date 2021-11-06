//Write a Java program to convert a given string into lowercase

import java.util.Scanner;

public class InputToLowercase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a String: ");
        String sentence = in.nextLine();
        in.close();
        sentence = sentence.toLowerCase();
        System.out.println(sentence);
    }
}