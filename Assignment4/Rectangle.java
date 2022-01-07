import java.util.Scanner;
public class Rectangle {
    private double width;
    private double height;

    //A no-arg constructor that sets default values
    public Rectangle() {
        width = 1;
        height = 1;
    }

    //Constructor to create a rectangle with specified height and width
    public Rectangle(double width, double height) throws IllegalArgumentException {
        if (!isValid(width)) {
            throw new IllegalArgumentException("Width of a rectangle can not be zero or negative. Please provide valid input when prompted.");
        }
        else if (!isValid(height)) {
            throw new IllegalArgumentException("Height of a rectangle can not be zero or negative. Please provide valid input when prompted.");
        }
        else {
            this.width = width;
            this.height = height;
        }
    }

    //Method to set width
    public void setWidth(double width) throws IllegalArgumentException {
        if (!isValid(width)) {
            throw new IllegalArgumentException("Width of a rectangle can not be zero or negative. Please provide valid input when prompted.");
        }
        else {
            this.width = width;
        }
    }
    //Method to set height
    public void setHeight(double height) throws IllegalArgumentException {
        if (!isValid(height)) {
            throw new IllegalArgumentException("Height of a rectangle can not be zero or negative. Please provide valid input when prompted.");
        }
        else {
            this.height = height;
        }
    }

    //isValid Method to check if input is valid or invalid
    public boolean isValid(double side) {
        if (side <= 0) {
            return false;
        }
        return true;
    }

    public double getArea() {
        return (width * height);
    }

    public double getPerimeter() {
        return(2 * (width + height));
    }
}