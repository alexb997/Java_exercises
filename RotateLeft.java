//Write a Java program to rotate an array (length 3) of integers in left direction.

import java.util.Arrays;

public class RotateLeft {
    public static void main(String[] args) {
        int[] array_nums = {111, 130, 452};
        System.out.println("Original Array: "+Arrays.toString(array_nums));
        int[] new_array_nums = {array_nums[1], array_nums[2], array_nums[0]};
        System.out.println("Rotated Array: "+ Arrays.toString(new_array_nums));
    }
}
