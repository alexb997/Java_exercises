//Write a Java program to convert a string to an integer in Java. 

import java.util.Scanner;

public class StringToInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input string to be converted: ");
        String string = input.nextLine();
        input.close(); 
        int result = Integer.parseInt(string);
        System.out.printf("The integer value is: %d",result);
    }
}