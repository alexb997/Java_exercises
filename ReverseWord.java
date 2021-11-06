//Write a Java program to reverse a word

import java.util.Scanner;

public class ReverseWord {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Insert the word: ");
        String word = in.nextLine();
        in.close();
        String reversedWord = "";
        for (int indexI = word.length() - 1; indexI >= 0; indexI--) {
            reversedWord = reversedWord + word.charAt(indexI);
        }
        System.out.println(reversedWord);
    }
}
