import java.util.Scanner;

public class PolygonArea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Insert number of sides: ");
        int n= in.nextInt();
        System.out.print("Insert length of side: ");
        int x= in.nextInt();
        in.close();
        double area = (n*(x*x))/(4*Math.tan(Math.PI/n));
        System.out.print("Resulted polygon area is: "+area);
    }
}