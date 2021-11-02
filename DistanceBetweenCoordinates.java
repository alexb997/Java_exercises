//Write a Java program to compute the distance between two points on the surface of earth.

import java.util.Scanner;

public class DistanceBetweenCoordinates {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x1,y1,x2,y2;
        System.out.print("Insert latitude of first point: ");
        x1=in.nextDouble();
        System.out.print("Insert longitude of first point: ");
        y1=in.nextDouble();
        System.out.print("Insert latitude of second point: ");
        x2=in.nextDouble();
        System.out.print("Insert longitude of second point: ");
        y2=in.nextDouble();
        in.close();
        double distance= Distance(x1,y1,x2,y2);
        System.out.print("Resulted distance is: "+ distance);
    }
    public static double Distance(double x1,double y1,double x2,double y2){
        x1=Math.toRadians(x1);
        y1=Math.toRadians(y1);
        x2=Math.toRadians(x2);
        y2=Math.toRadians(y2);
        double earthRadius = 6371.01;
        return earthRadius * Math.acos(Math.sin(x1)*Math.sin(x2) + Math.cos(x1)*Math.cos(x2)*Math.cos(y1 - y2));
    }
}
