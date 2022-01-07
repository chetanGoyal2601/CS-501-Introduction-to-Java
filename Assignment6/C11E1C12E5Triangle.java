public class C11E1C12E5Triangle extends GeometricObject {
    private double side1;
    private double side2;
    private double side3;

    public C11E1C12E5Triangle() {
        side1 = 1.0;
        side2 = 1.0;
        side3 = 1.0;
    }

    public C11E1C12E5Triangle(double side1, double side2, double side3) throws IllegalTriangleException {
        if (side1 + side2 > side3 && side2 + side3 > side1 && side3 + side1 > side2) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }
        else
            throw new IllegalTriangleException();
    }

    public double getside1() {
        return side1;
    }

    public double getside2() {
        return side2;
    }

    public double getside3() {
        return side3;
    }

    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        double area = Math.pow((s * (s-side1) * (s - side2) * (s - side3)), 0.5);
        return area;
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    public String toString() {
        return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
    }

    
}