public class IllegalTriangleException extends Exception {
    public IllegalTriangleException() {
        super("Invalid Triangle. The sum of sides of two triangles must be greater than the the third!");
    }
}