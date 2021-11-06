// Write a Java program to find the penultimate (next to last) word of a sentence

import java.util.Scanner;

public class PenultimateElement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Insert the sentence: ");
        String sentence = in.nextLine();
        in.close();
        String[] sentenceArray = sentence.split(" ");
        System.out.println(sentenceArray[sentenceArray.length - 2]);
    }
}
