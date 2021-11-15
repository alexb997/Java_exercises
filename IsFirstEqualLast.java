//Write a Java program to test if the first and the last element of an array of integers are same.
// The length of the array must be greater than or equal to 2.

public class IsFirstEqualLast {
    public static void main(String[] args) {
        int[] numbersArray = {50, -20, 0, 30, 40, 60, 10};

        System.out.println (numbersArray.length >= 2 && numbersArray[0] ==  numbersArray[numbersArray.length-1]);
    }
}
