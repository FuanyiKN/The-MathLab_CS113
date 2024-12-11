package cosc113.guimathlab.dao;

public class CalculatorProject {

    // Basic Arithmetic
    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }

    // Geometry
    public static double rectangleArea(double length, double width) {
        return length * width;
    }

    public static double rectanglePerimeter(double length, double width) {
        return 2 * (length + width);
    }

    public static double sphereVolume(double radius) {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    public static double sphereSurfaceArea(double radius) {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    // Trigonometry
    public static double sine(double angleInDegrees) {
        return Math.sin(Math.toRadians(angleInDegrees));
    }

    public static double cosine(double angleInDegrees) {
        return Math.cos(Math.toRadians(angleInDegrees));
    }

    public static double tangent(double angleInDegrees) {
        return Math.tan(Math.toRadians(angleInDegrees));
    }

    // Advanced Arithmetic
    public static double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public static double squareRoot(double value) {
        return Math.sqrt(value);
    }

    public static int modulus(int a, int b) {
        return a % b;
    }

    // Exponential and Logarithmic Functions
    public static double naturalLog(double value) {
        return Math.log(value);
    }

    public static double logBase10(double value) {
        return Math.log10(value);
    }

    public static double exponential(double exponent) {
        return Math.exp(exponent);
    }

    // Miscellaneous
    public static double absoluteValue(double value) {
        return Math.abs(value);
    }

    public static long factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}