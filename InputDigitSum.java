//Write a Java program and compute the sum of the digits of an integer.

import java.util.Scanner;

public class InputDigitSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Insert number: ");
        int x=in.nextInt();
        in.close();
        int sum=0;
        System.out.print("The digits sum of "+x+" is: ");
        while(x!=0){
            sum+=x%10;
            x=x/10;
        }
        System.out.print(sum);
    }
}