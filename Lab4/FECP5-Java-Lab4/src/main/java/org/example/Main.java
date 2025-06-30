package org.example;

import java.util.*;

public class Main {

    public static double calculateCircleArea(double radius){
        double circleArea = Math.PI * radius * radius;

        return circleArea;
    }

    public static double calculateTriangleArea(double base, double height){
        double triangleArea = (0.5) * (base * height);

        return triangleArea;
    }

    public static double calculateRectangleArea(double length, double width){
        double rectangleArea = length * width;

        return rectangleArea;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Area Calculator ===");
        System.out.println("1. Circle");
        System.out.println("2. Triangle");
        System.out.println("3. Rectangle");
        System.out.println("Choose a shape (1-3):");

        int shapeChoice = scanner.nextInt();

        switch (shapeChoice){
            case 1:

                System.out.printf("Enter the radius: ");
                double radius = scanner.nextDouble();

                System.out.printf("Area of the circle: %.2f", calculateCircleArea(radius));

                break;
            case 2:

                System.out.printf("Enter the base: ");
                double base = scanner.nextDouble();

                System.out.printf("Enter the height: ");
                double height = scanner.nextDouble();

                System.out.printf("Area of the triangle: %.2f", calculateTriangleArea(base, height));

                break;
            case 3:

                System.out.printf("Enter the length: ");
                double length = scanner.nextDouble();

                System.out.printf("Enter the width: ");
                double width = scanner.nextDouble();

                System.out.printf("Area of the rectangle: %.2f", calculateRectangleArea(length, width));

                break;
        }

    }
}