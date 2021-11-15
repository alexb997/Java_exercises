//Write a Java program to check whether a security manager has already been established for the current
// application or not.

public class IsSecurityManager {
    public static void main(String[] args) {
        System.out.println("System security interface:");
        System.out.println(System.getSecurityManager());
    }
}
