import java.util.Scanner;
import java.util.Rectangle;
public class TestRectangle {
    public static void main(String[] args) {
        System.out.println("This program asks user to input width and height for a rectangle. And then it prints the area and perimeter for that rectangle.");
        System.out.println("The program after returning the area and perimeter asks the user if they wish to continue or stop the program, and performs accordingly.");
        System.out.println("If the user provides invalid input, like negative or zero values for the input, the program validates these input and informs the user of the blunder and asks to provide the inputs again.");
        Scanner inp = new Scanner(System.in);
        boolean stop = false;
        while (stop == false) {
            try {
                System.out.print("\nEnter two positive numbers in a single line, one being the width and the other being the height of the rectangle respectively, seperated by single space: ");
                double w = inp.nextDouble();
                double h = inp.nextDouble();
                Rectangle r = new Rectangle(w, h);
                System.out.println("\nThe perimeter of the rectangle is " + r.getPerimeter());
                System.out.println("\nThe area of the rectangle is " + r.getArea());
                System.out.print("\nIf you do not wish to repeat this program, enter 0 but if you wish to continue enter any other integer number: ");
                int repeat = inp.nextInt();
                if (repeat == 0) {
                    stop = true;
                }
            }
            catch (IllegalArgumentException ex) {
                System.out.println(ex);
            }
        }
    }
}