import java.util.Scanner;
public class C10E13TestMyRectangle2D {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        boolean toCheckWithBase = true;
        while (toCheckWithBase) {
            C10E13MyRectangle2D base = new C10E13MyRectangle2D();
            System.out.println("This program asks the user to provide the height, width and centre coordiantes for a base rectangle\nand then asks for the height, width and centre coordinates for another rectangle, and checks if the latter rectangle\nis inside the base rectangle, or if it overlaps, abuts or is distinct.");
            System.out.print("\nEnter, respectively, the x and y coordinates for the centre of the base rectangle (two real numbers seperated by a single space): ");
            base.setX(inp.nextDouble());
            base.setY(inp.nextDouble()); 
            boolean positiveHeightWidthBase = false;
            while (!positiveHeightWidthBase) {
                System.out.print("\nEnter, respectively, the height and width for the base rectangle (that must be real positive numbers seperated by a single space): ");
                double baseHeight = inp.nextDouble();
                double baseWidth = inp.nextDouble();
                if (baseHeight > 0 && baseWidth > 0) {
                    positiveHeightWidthBase = true;
                    base.setHeight(baseHeight);
                    base.setWidth(baseWidth);
                }
                else {
                    System.out.println("Negative values entered. Height and width are to be positive only. Enter again when prompted.");
                }
            }
            boolean toCheckWithR = true;
            while(toCheckWithR) {
                C10E13MyRectangle2D r = new C10E13MyRectangle2D();
                System.out.print("\nEnter, respectively, the x and y coordinates for the centre of the other rectangle (two real numbers seperated by a single space): ");
                r.setX(inp.nextDouble());
                r.setY(inp.nextDouble());  
                boolean positiveHeightWidthR = false;
                while (!positiveHeightWidthR) {
                    System.out.print("\nEnter, respectively, the height and width for the base rectangle (that must be real positive numbers seperated by a single space): ");
                    double rHeight = inp.nextDouble();
                    double rWidth = inp.nextDouble();
                    if (rHeight > 0 && rWidth > 0) {
                        positiveHeightWidthR = true;
                        r.setHeight(rHeight);
                        r.setWidth(rWidth);
                    }
                    else {
                        System.out.println("Negative values entered. Height and width are to be positive only. Enter again when prompted");
                    }
                }
                if (base.specialCase(r)) {
                    System.out.println("\nBoth the rectangle are concurrent and they share the same boundaries and the centre. So they are overlap as well as abut each other but no one contains any and neither are they distinct.");
                }

                if (base.contains(r)) {
                    System.out.println("\nThe base rectangle CONTAINS the other rectangle.");
                }
                else {
                    System.out.println("\nThe base rectangle DOES NOT CONTAIN the other rectangle.");
                }
                
                if (r.contains(base)) {
                    System.out.println("\nThe other rectangle is bigger than the base rectangle and it's x and y are such that the other rectangle contains the base rectangle.");
                }

                if (base.overlaps(r)) {
                    System.out.println("\nThe base rectangle and the other rectangle OVERLAP each other.");
                }
                else
                    System.out.println("\nThe base rectangle and the other rectangle DO NOT OVERLAP each other.");

                if (base.abuts(r)) {
                    System.out.println("\nThe base rectangle ABUTS the other rectangle.");
                }
                else
                    System.out.println("\nThe base rectangle and the other rectangle DO NOT ABUT.");

                if (base.distinct(r)) {
                    System.out.println("\nBoth the rectangles are DISTINCT.");
                }
                else
                    System.out.println("\nThe rectangles are NOT DISTINCT.");

                System.out.print("\nIf you wish to check with another value of the other rectangle to compare with the same base rectangle, press 1 else press 0: ");
                if (inp.nextInt() != 1) {
                    toCheckWithR = false;
                }
            }
            System.out.print("\nIf you wish to continue the program and reenter the BASE rectangle values, press 1 else press 0: ");
            if (inp.nextInt() != 1) {
                toCheckWithBase = false;
            }
        }

        inp.close();
    }
}