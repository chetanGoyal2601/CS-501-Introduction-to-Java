import java.util.Scanner;
public class C11E1C12E5TestTriangle {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("This program asks the user to provide the values of sides of a triangle to make a triangle, get its area and perimeter. \nIt extends the Geometric Object class to fill in colour, if it is filled and store the date when it gets created.\nIt then prints all these values.\nIt also throws exception via a custom class when the triangle is invalid, i.e. a negative side is entered or the two sides of the triangle are less than the third side.");
        boolean toContinue = true;
        while(toContinue == true) {
            System.out.print("\nEnter the three sides of a triangle seperated by a single space. They can be any positive real numbers: ");
            double side1  = inp.nextDouble();
            double side2 = inp.nextDouble();
            double side3 = inp.nextDouble();
            try {
                C11E1C12E5Triangle t = new C11E1C12E5Triangle(side1, side2, side3);
                System.out.print("Enter the color you want for the triangle: ");
                t.setColor(inp.next());
                System.out.print("Enter true if you want the triangle to be filled, else enter false: ");
                t.setFilled(inp.nextBoolean());
                System.out.println("The area of the triangle is: " + t.getArea());
                System.out.println("The perimeter of the triangle is: " + t.getPerimeter());
                System.out.println("The color of the triangle is: " + t.getColor());
                if (t.isFilled()){
                    System.out.println("The triangle is filled.");
                }
                else
                    System.out.println("The triangle is NOT filled.");
                System.out.print("\nIf you wish to continue the program with new inputs, press 1 else press 0: ");
                if (inp.nextInt() == 1) {
                    toContinue = true;
                }
                else
                    toContinue = false;
            }
            catch (IllegalTriangleException ex) {
                System.out.println();
                System.out.println(ex);
                System.out.print("\nIf you wish to continue the program with new inputs, press 1 else press 0: ");
                if (inp.nextInt() == 1) {
                    toContinue = true;
                }
                else
                    toContinue = false;
            }
        }
        inp.close();
    }
}