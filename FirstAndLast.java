//Write a Java program to create a new array of length 2 from two arrays of integers with three
// elements and the new array will contain the first and last elements from the two arrays.

import java.util.Arrays;

public class FirstAndLast {
    public static void main(String[] args) {
        int[] array1 = {50, -20, 0};
        int[] array2 = {5, -50, 10};
        System.out.println("Array1: "+ Arrays.toString(array1));
        System.out.println("Array2: "+Arrays.toString(array2));
        int[] array_new = {array1[0], array2[2]};
        System.out.println("New Array: "+Arrays.toString(array_new));
    }
}
