//Kindly use the input file 'InputForAssignment4' for inputs
import java.util.Scanner;
public class C9E11E12LinearEquation {
    private double a, b, c, d, e, f;
    
    //Constructor with all 6 arguments
    public C9E11E12LinearEquation(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    //Getter method for a
    public double getA() {
        return a;
    }

    //Getter method for b
    public double getB() {
        return b;
    }

    //Getter method for c
    public double getC() {
        return c;
    }

    //Getter method for d
    public double getD() {
        return d;
    }

    //Getter method for e
    public double getE() {
        return e;
    }

    //Getter method for f
    public double getF() {
        return f;
    }

    //Method to return true if solvable equation, This acts like isValid
    public boolean isSolvable() {
        if (((a * d) - (b * c)) == 0) {
            return false;
        }
        else {
            return true;
        }
    }

    //Method to get the value of x
    public double getX() throws ArithmeticException {
        if (isSolvable()) {
            return (((e * d) - (b * f)) / ((a * d) - (b * c)));
        }
        else {
            throw new ArithmeticException("The equation has no solution!");
        }
    }

    //Method to get the value of y
    public double getY() throws ArithmeticException {
        if (isSolvable()) {
            return (((a * f) - (e * c)) / ((a * d) - (b * c)));
        }
        else {
            throw new ArithmeticException("The equation has no solution!");
        }
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("This program first takes in six numbers- a, b, c, d, e, f for two linear equation ax + by = e and cx + dy = f and finds the solution for x and y using Cramer's rule. If however ad - bc is equal to 0, it gives no solution as output in the form of ArithmeticException.");
        System.out.println("Then this program, takes in coordinates for four points, and determines if the lines of such coordinates intersect or are parallel, and gives the output accordingly.\n");
        boolean stop = false;
        while (stop == false) {
            System.out.print("Enter six numbers which will be the values of a, b, c, d, e and f repectively. They can be any real numbers, seperated over a single space: ");
            double a = inp.nextDouble();
            double b = inp.nextDouble();
            double c = inp.nextDouble();
            double d = inp.nextDouble();
            double e = inp.nextDouble();
            double f = inp.nextDouble();
            C9E11E12LinearEquation equation = new C9E11E12LinearEquation(a, b, c, d, e, f);
            if (equation.isSolvable()) {
                System.out.println("\nThe value of x is: " + equation.getX());
                System.out.println("The value of y is: " + equation.getY());
            }
            else {
                System.out.println("The equation has no solution.");
            }
            System.out.println("\nEnter eight numbers seperated by single space such that they belong to the four points on the Cartesian plane- x1, y1, x2, y2, x3, y3, x4, y4 respectively: ");
            double x1 = inp.nextDouble();
            double y1 = inp.nextDouble();
            double x2 = inp.nextDouble();
            double y2 = inp.nextDouble();
            double x3 = inp.nextDouble();
            double y3 = inp.nextDouble();
            double x4 = inp.nextDouble();
            double y4 = inp.nextDouble();
            a = y1 - y2;
            b = x2 - x1;
            e = (a * x1) + (b * y1);
            c = y3 - y4;
            d = x4 - x3;
            f = (d * x3) + (e * y3);
            C9E11E12LinearEquation lines = new C9E11E12LinearEquation(a, b, c, d, e, f);
            if (lines.isSolvable()) {
                System.out.println("\nThe intersection of the lines happens at the points x: " + lines.getX() + " and y: " + lines.getY());
            }
            else {
                System.out.println("The lines are parallel and have no intersection.");
            }
            System.out.print("\nIf you do not wish to repeat this program, enter 0 but if you wish to continue enter any other integer number: ");
            int repeat = inp.nextInt();
            if (repeat == 0) {
                stop = true;
            }
            System.out.println();
        }

    }
}