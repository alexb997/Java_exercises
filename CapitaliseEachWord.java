//Write a Java program to capitalize the first letter of each word in a sentence

import java.util.Arrays;
import java.util.Scanner;

public class CapitaliseEachWord {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String sentence = in.nextLine();
        in.close();
        String[] sentenceArray = sentence.split(" ");
        Arrays.stream(sentenceArray).forEach(element -> {
            System.out.print(element.substring(0, 1).toUpperCase() + element.substring(1) + " ");
        });
    }
}