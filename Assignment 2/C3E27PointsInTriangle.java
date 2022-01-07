import java.util.Scanner;
public class C3E27PointsInTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x1 = 0;
        double x2 = 0;
        double x3 = 200;
        double y1 = 100;
        double y2 = 0;
        double y3 = 0;

        double side1 = Math.pow((Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2)), 0.5);
        double side2 = Math.pow((Math.pow((x2 - x3), 2) + Math.pow((y2 - y3), 2)), 0.5);
        double side3 = Math.pow((Math.pow((x3 - x1), 2) + Math.pow((y3 - y1), 2)), 0.5);
        double s = (side1 + side2 + side3) / 2;
        double area = Math.pow((s * (s - side1) * (s - side2) * (s - side3)), 0.5);

        System.out.print("This program is to determine if a point (x, y) lies in a triangle whose vertices are: ");
        System.out.println("(" + x1 + ", " + y1 + "), (" + x2 + ", " + y2 + "), (" + x3 + ", " + y3 + ")");
        System.out.print("Enter a point's x- and y-coordinates (numbers only). Please input the points in a single line sperated by spaces:  ");
        double xp = in.nextDouble();
        double yp = in.nextDouble();

        double sideA1 = Math.pow((Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2)), 0.5);
        double sideA2 = Math.pow((Math.pow((x2 - xp), 2) + Math.pow((y2 - yp), 2)), 0.5);
        double sideA3 = Math.pow((Math.pow((xp - x1), 2) + Math.pow((yp - y1), 2)), 0.5);
        double sA = (sideA1 + sideA2 + sideA3) / 2;
        double areaA = Math.pow((sA * (sA - sideA1) * (sA - sideA2) * (sA - sideA3)), 0.5);

        double sideB1 = Math.pow((Math.pow((x1 - xp), 2) + Math.pow((y1 - yp), 2)), 0.5);
        double sideB2 = Math.pow((Math.pow((xp - x3), 2) + Math.pow((yp - y3), 2)), 0.5);
        double sideB3 = Math.pow((Math.pow((x3 - x1), 2) + Math.pow((y3 - y1), 2)), 0.5);
        double sB = (sideB1 + sideB2 + sideB3) / 2;
        double areaB = Math.pow((sB * (sB - sideB1) * (sB - sideB2) * (sB - sideB3)), 0.5);

        double sideC1 = Math.pow((Math.pow((xp - x2), 2) + Math.pow((yp - y2), 2)), 0.5);
        double sideC2 = Math.pow((Math.pow((x2 - x3), 2) + Math.pow((y2 - y3), 2)), 0.5);
        double sideC3 = Math.pow((Math.pow((x3 - xp), 2) + Math.pow((y3 - yp), 2)), 0.5);
        double sC = (sideC1 + sideC2 + sideC3) / 2;
        double areaC = Math.pow((sC * (sC - sideC1) * (sC - sideC2) * (sC - sideC3)), 0.5);

        if (areaA + areaB + areaC <= area) System.out.println("The point is in the triangle.");
        else System.out.println("\nThe point is outside the triangle");
    }
}