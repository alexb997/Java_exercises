//Write a Java program to convert seconds to hour, minute and seconds.

import java.util.Scanner;

public class SecondsToHoursMinutesSeconds {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input seconds: ");
        int inputSeconds = in.nextInt();
        in.close();
        int seconds = inputSeconds % 60;
        int hours = inputSeconds / 60;
        int minutes = hours % 60;
        hours = hours / 60;
        System.out.print(hours + ":" + minutes + ":" + seconds);
        System.out.print("\n");
    }
}
