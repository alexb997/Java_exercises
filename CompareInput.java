// Write a Java program to compare two numbers

import java.util.Scanner;

public class CompareInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Insert first input:");
        int x=in.nextInt();
        System.out.print("Insert second input:");
        int y=in.nextInt();
        in.close();
        if(x>y)
            System.out.println(x+" > "+y);
        if(x<y)
            System.out.println(x+" < "+y);
        if(x>=y)
            System.out.println(x+" >= "+y);
        if(x<=y)
            System.out.println(x+" <= "+y);
        if(x==y)
            System.out.println(x+" == "+y);
        if(x!=y)
            System.out.println(x+" != "+y);
    }
}