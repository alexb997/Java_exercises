import java.util.Scanner;

public class HexagonArea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Insert lenght of a side: ");
        int x=in.nextInt();
        in.close();
        double area=(6*(x*x))/(4*Math.tan(Math.PI/6));
        System.out.print("Area of the hexagon is: "+ area);
    }
}