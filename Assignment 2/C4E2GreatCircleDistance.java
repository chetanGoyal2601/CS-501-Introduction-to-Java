import java.util.Scanner;
public class C4E2GreatCircleDistance {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        final double RADIUS = 6371.01;
        System.out.println("We are going to calculate the great circle distance between two points on Earth using the geographical longitude and latitutde.");
        System.out.print("Enter point 1 (latitude and longitude - numbers only) in degrees in a single line seperated by a space: ");
        double x1 = Math.toRadians(inp.nextDouble());
        double y1 = Math.toRadians(inp.nextDouble());
        System.out.print("Enter point 2 (latitude and longitude - numbers only) in degrees in a single line seperated by a space: ");
        double x2 = Math.toRadians(inp.nextDouble());
        double y2 = Math.toRadians(inp.nextDouble());
        double d = RADIUS * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
        System.out.println("The distance between the two points is " + d + " km");
    }
}