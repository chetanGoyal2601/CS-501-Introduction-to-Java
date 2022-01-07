import java.util.Scanner;
public class C3E3LinearEquation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This program will solve 2x2 linear equations using Cramers's rule. This rule requires six constants to solve for two variables - x and y.");
        System.out.println("The two equations are: \n 1. ax + by = e \n 2. cx + dy = f");
        System.out.print("Kindly input the values (numbers only) for a, b, c, d, e, f respectively in a single line seperated by space: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();
        double denominator = (a * d) - (b * c);
        double numeratorForX = (e * d) - (b * f);
        double numeratorForY = (a * f) - (e * c);
        if (denominator == 0) System.out.println("The equation has no solution.");
        else System.out.println("x is " + numeratorForX / denominator + " and y is " + numeratorForY / denominator);
    }
}