import java.lang.Math;

public class AreaCalculator {
    public double calculate(double radius) {
        // calculate area of circle
        return Math.PI * radius * radius;
    }

    public double calculate(double width, double height) {
        // calculate area of rectangle
        return width * height;
    }

    public double calculate(double base, double height, boolean isTriangle) {
        // calculate area of triangle
        //if (isTriangle) {
            return base * height * 0.5;
        //}

    }

    public double calculate(double side, boolean isSquare) {
        // calculate area of square
        //if (isSquare) {
            return side * side;
        //}
    }
}