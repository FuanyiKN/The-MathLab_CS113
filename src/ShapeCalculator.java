import java.util.Scanner;

public class ShapeCalculator {
    // 2D Shapes
    public double calculateSquareArea(double side) {
        return Math.pow(side, 2);
    }

    public double calculateSquarePerimeter(double side) {
        return 4 * side;
    }

    public double calculateRectangleArea(double length, double width) {
        return length * width;
    }

    public double calculateRectanglePerimeter(double length, double width) {
        return 2 * (length + width);
    }

    public double calculateCircleArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    public double calculateCirclePerimeter(double radius) {
        return 2 * Math.PI * radius;
    }

    public double calculateTriangleArea(double base, double height) {
        return 0.5 * base * height;
    }

    public double calculateTrianglePerimeter(double sideA, double sideB, double base) {
        return sideA + sideB + base;
    }

    public double calculateParallelogramArea(double base, double height) {
        return base * height;
    }

    public double calculateParallelogramPerimeter(double base, double side) {
        return 2 * (base + side);
    }

    public double calculateTrapezoidArea(double base1, double base2, double height) {
        return 0.5 * (base1 + base2) * height;
    }

    public double calculateTrapezoidPerimeter(double base1, double base2, double sideA, double sideB) {
        return base1 + base2 + sideA + sideB;
    }

    // 3D Shapes
    public double calculateCubeSurfaceArea(double side) {
        return 6 * Math.pow(side, 2);
    }

    public double calculateCubeVolume(double side) {
        return Math.pow(side, 3);
    }

    public double calculateSphereSurfaceArea(double radius) {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    public double calculateSphereVolume(double radius) {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    public double calculateCylinderSurfaceArea(double radius, double height) {
        return 2 * Math.PI * radius * (radius + height);
    }

    public double calculateCylinderVolume(double radius, double height) {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    public double calculateConeSurfaceArea(double radius, double slantHeight) {
        return Math.PI * radius * (radius + slantHeight);
    }

    public double calculateConeVolume(double radius, double height) {
        return (1.0 / 3.0) * Math.PI * Math.pow(radius, 2) * height;
    }

    public void shapeCalculator(Scanner scnr){
        System.out.println("2D: square, rectangle, triangle, circle, parallelogram, trapezoid");
        System.out.println("3D: cube, cylinder, sphere, cone");

        System.out.print("Enter the shape you want to calculate: ");
        String shape = scnr.nextLine().toLowerCase();

        switch (shape) {
            // 2D Shapes
            case "square":
                System.out.print("Enter the side length: ");
                double side = scnr.nextDouble();
                System.out.printf("Area: %.2f\n", calculateSquareArea(side));
                System.out.printf("Perimeter: %.2f\n", calculateSquarePerimeter(side));
                break;

            case "rectangle":
                System.out.print("Enter the length: ");
                double length = scnr.nextDouble();
                System.out.print("Enter the width: ");
                double width = scnr.nextDouble();
                System.out.printf("Area: %.2f\n", calculateRectangleArea(length, width));
                System.out.printf("Perimeter: %.2f\n", calculateRectanglePerimeter(length, width));
                break;

            case "circle":
                System.out.print("Enter the radius: ");
                double radius = scnr.nextDouble();
                System.out.printf("Area: %.2f\n", calculateCircleArea(radius));
                System.out.printf("Perimeter: %.2f\n", calculateCirclePerimeter(radius));
                break;

            case "triangle":
                System.out.print("Enter the base: ");
                double base = scnr.nextDouble();
                System.out.print("Enter the height: ");
                double height = scnr.nextDouble();
                System.out.print("Enter side A: ");
                double sideA = scnr.nextDouble();
                System.out.print("Enter side B: ");
                double sideB = scnr.nextDouble();
                System.out.printf("Area: %.2f\n", calculateTriangleArea(base, height));
                System.out.printf("Perimeter: %.2f\n", calculateTrianglePerimeter(sideA, sideB, base));
                break;

            case "parallelogram":
                System.out.print("Enter the base: ");
                base = scnr.nextDouble();
                System.out.print("Enter the height: ");
                height = scnr.nextDouble();
                System.out.print("Enter the side length: ");
                side = scnr.nextDouble();
                System.out.printf("Area: %.2f\n", calculateParallelogramArea(base, height));
                System.out.printf("Perimeter: %.2f\n", calculateParallelogramPerimeter(base, side));
                break;

            case "trapezoid":
                System.out.print("Enter the first base: ");
                double base1 = scnr.nextDouble();
                System.out.print("Enter the second base: ");
                double base2 = scnr.nextDouble();
                System.out.print("Enter the height: ");
                height = scnr.nextDouble();
                System.out.print("Enter side A: ");
                sideA = scnr.nextDouble();
                System.out.print("Enter side B: ");
                sideB = scnr.nextDouble();
                System.out.printf("Area: %.2f\n", calculateTrapezoidArea(base1, base2, height));
                System.out.printf("Perimeter: %.2f\n", calculateTrapezoidPerimeter(base1, base2, sideA, sideB));
                break;

            // 3D Shapes
            case "cube":
                System.out.print("Enter the side length: ");
                side = scnr.nextDouble();
                System.out.printf("Surface Area: %.2f\n", calculateCubeSurfaceArea(side));
                System.out.printf("Volume: %.2f\n", calculateCubeVolume(side));
                break;

            case "sphere":
                System.out.print("Enter the radius: ");
                radius = scnr.nextDouble();
                System.out.printf("Surface Area: %.2f\n", calculateSphereSurfaceArea(radius));
                System.out.printf("Volume: %.2f\n", calculateSphereVolume(radius));
                break;

            case "cylinder":
                System.out.print("Enter the radius: ");
                radius = scnr.nextDouble();
                System.out.print("Enter the height: ");
                height = scnr.nextDouble();
                System.out.printf("Surface Area: %.2f\n", calculateCylinderSurfaceArea(radius, height));
                System.out.printf("Volume: %.2f\n", calculateCylinderVolume(radius, height));
                break;

            case "cone":
                System.out.print("Enter the radius: ");
                radius = scnr.nextDouble();
                System.out.print("Enter the slant height: ");
                double slantHeight = scnr.nextDouble();
                System.out.print("Enter the height: ");
                height = scnr.nextDouble();
                System.out.printf("Surface Area: %.2f\n", calculateConeSurfaceArea(radius, slantHeight));
                System.out.printf("Volume: %.2f\n", calculateConeVolume(radius, height));
                break;

            default:
                System.out.println("Sorry, we don't have calculations for this shape yet.");
        }
    }
}
