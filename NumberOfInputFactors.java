//Write a Java program to accepts an integer and count the factors of the number

import java.util.Scanner;

public class NumberOfInputFactors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the integer: ");
        int nr = in.nextInt();
        in.close();
        System.out.println(nrFactors(nr));
    }

    public static int nrFactors(int num) {
        int result = 0;
        for (int indexI = 1; indexI <= (int) Math.sqrt(num); indexI++) {
            if (num % indexI == 0 && indexI * indexI != num) {
                result += 2;
            } else if (indexI * indexI == num) {
                result++;
            }
        }
        return result;
    }
}
