import javax.swing.JOptionPane;

public class Shape {
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

    public void shapesCalculator() {
        String shape = JOptionPane.showInputDialog(null, """
                2D: square, rectangle, triangle, circle, parallelogram, trapezoid
                3D: cube, cylinder, sphere, cone
                Enter the shape you want to calculate:
                """).toLowerCase();

        switch (shape) {
            case "square" -> {
                double side = Double.parseDouble(JOptionPane.showInputDialog("Enter the side length:"));
                side = Math.abs(side);
                JOptionPane.showMessageDialog(null, "Area: " + calculateSquareArea(side) +
                        "\nPerimeter: " + calculateSquarePerimeter(side));
            }
            case "rectangle" -> {
                double length = Double.parseDouble(JOptionPane.showInputDialog("Enter the length:"));
                length = Math.abs(length);
                double width = Double.parseDouble(JOptionPane.showInputDialog("Enter the width:"));
                width = Math.abs(width);
                JOptionPane.showMessageDialog(null, "Area: " + calculateRectangleArea(length, width) +
                        "\nPerimeter: " + calculateRectanglePerimeter(length, width));
            }
            case "circle" -> {
                double radius = Double.parseDouble(JOptionPane.showInputDialog("Enter the radius:"));
                radius = Math.abs(radius);
                JOptionPane.showMessageDialog(null, "Area: " + calculateCircleArea(radius) +
                        "\nPerimeter: " + calculateCirclePerimeter(radius));
            }
            case "triangle" -> {
                double base = Double.parseDouble(JOptionPane.showInputDialog("Enter the base:"));
                base = Math.abs(base);
                double height = Double.parseDouble(JOptionPane.showInputDialog("Enter the height:"));
                height = Math.abs(height);
                double sideA = Double.parseDouble(JOptionPane.showInputDialog("Enter side A:"));
                sideA = Math.abs(sideA);
                double sideB = Double.parseDouble(JOptionPane.showInputDialog("Enter side B:"));
                sideB = Math.abs(sideB);
                JOptionPane.showMessageDialog(null, "Area: " + calculateTriangleArea(base, height) +
                        "\nPerimeter: " + calculateTrianglePerimeter(sideA, sideB, base));
            }
            case "parallelogram" -> {
                double base = Double.parseDouble(JOptionPane.showInputDialog("Enter the base:"));
                base = Math.abs(base);
                double height = Double.parseDouble(JOptionPane.showInputDialog("Enter the height:"));
                height = Math.abs(height);
                double side = Double.parseDouble(JOptionPane.showInputDialog("Enter the side length:"));
                side = Math.abs(side);
                JOptionPane.showMessageDialog(null, "Area: " + calculateParallelogramArea(base, height) +
                        "\nPerimeter: " + calculateParallelogramPerimeter(base, side));
            }
            case "trapezoid" -> {
                double base1 = Double.parseDouble(JOptionPane.showInputDialog("Enter the first base:"));
                base1 = Math.abs(base1);
                double base2 = Double.parseDouble(JOptionPane.showInputDialog("Enter the second base:"));
                base2 = Math.abs(base2);
                double height = Double.parseDouble(JOptionPane.showInputDialog("Enter the height:"));
                height = Math.abs(height);
                double sideA = Double.parseDouble(JOptionPane.showInputDialog("Enter side A:"));
                sideA = Math.abs(sideA);
                double sideB = Double.parseDouble(JOptionPane.showInputDialog("Enter side B:"));
                sideB = Math.abs(sideB);
                JOptionPane.showMessageDialog(null, "Area: " + calculateTrapezoidArea(base1, base2, height) +
                        "\nPerimeter: " + calculateTrapezoidPerimeter(base1, base2, sideA, sideB));
            }
            case "cube" -> {
                double side = Double.parseDouble(JOptionPane.showInputDialog("Enter the side length:"));
                side = Math.abs(side);
                JOptionPane.showMessageDialog(null, "Surface Area: " + calculateCubeSurfaceArea(side) +
                        "\nVolume: " + calculateCubeVolume(side));
            }
            case "sphere" -> {
                double radius = Double.parseDouble(JOptionPane.showInputDialog("Enter the radius:"));
                radius = Math.abs(radius);
                JOptionPane.showMessageDialog(null, "Surface Area: " + calculateSphereSurfaceArea(radius) +
                        "\nVolume: " + calculateSphereVolume(radius));
            }
            case "cylinder" -> {
                double radius = Double.parseDouble(JOptionPane.showInputDialog("Enter the radius:"));
                radius = Math.abs(radius);
                double height = Double.parseDouble(JOptionPane.showInputDialog("Enter the height:"));
                height = Math.abs(height);
                JOptionPane.showMessageDialog(null, "Surface Area: " + calculateCylinderSurfaceArea(radius, height) +
                        "\nVolume: " + calculateCylinderVolume(radius, height));
            }
            case "cone" -> {
                double radius = Double.parseDouble(JOptionPane.showInputDialog("Enter the radius:"));
                radius = Math.abs(radius);
                double slantHeight = Double.parseDouble(JOptionPane.showInputDialog("Enter the slant height:"));
                slantHeight = Math.abs(slantHeight);
                double height = Double.parseDouble(JOptionPane.showInputDialog("Enter the height:"));
                height = Math.abs(height);
                JOptionPane.showMessageDialog(null, "Surface Area: " + calculateConeSurfaceArea(radius, slantHeight) +
                        "\nVolume: " + calculateConeVolume(radius, height));
            }
            default -> JOptionPane.showMessageDialog(null, "Sorry, we don't have calculations for this shape yet.");
        }
    }
}