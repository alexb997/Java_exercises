//Write a Java program to count the letters, spaces, numbers and other characters of an input string

import java.util.Scanner;

public class CountStringElements {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the string: ");
        String str= in.nextLine();
        in.close();
        char[] ch = str.toCharArray();
        int letter = 0;
        int space = 0;
        int num = 0;
        int other = 0;
        for(int i = 0; i < str.length(); i++){
            if(Character.isLetter(ch[i])){
                letter ++ ;
            }
            else if(Character.isDigit(ch[i])){
                num ++ ;
            }
            else if(Character.isSpaceChar(ch[i])){
                space ++ ;
            }
            else{
                other ++;
            }
        }
        System.out.println("letter: " + letter);
        System.out.println("space: " + space);
        System.out.println("number: " + num);
        System.out.println("other: " + other);
    }
}
