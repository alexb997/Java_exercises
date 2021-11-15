//Write a Java program to test if the first or the last element of two array of integers are same.
// The length of the array must be greater than or equal to 2

public class OnesHeadAnothersEnd {
    public static void main(String[] args) {
        int[] numbersArray1 = {50,131,241,-13};
        int[] numbersArray2 = {45,231,33,1};
        if(numbersArray1.length>=2 && numbersArray2.length>=2)
        {
            System.out.println(numbersArray1[0] == numbersArray2[0] || numbersArray1[numbersArray1.length-1] == numbersArray2[numbersArray2.length-1]);
        }
        else
        {
            System.out.println("Array lengths less than 2.");
        }
    }
}
