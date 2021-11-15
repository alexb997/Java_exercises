//Write a Java program to take the last three characters from a
// given string and add the three characters at both the front and back of the string.
// String length must be greater than three and more.

public class Padding {
    public static void main(String[] args) {
        String string1 = "Python";
        int length = 3;
        if (length > string1.length()) {
            length = string1.length();
        }

        String subpart = string1.substring(string1.length()-3);
        System.out.println(subpart + string1 + subpart);
    }
}
