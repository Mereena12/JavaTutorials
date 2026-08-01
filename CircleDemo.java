package practice;

import java.util.Scanner;

class Circle {
   
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    void displayDetails() {
        double area = Math.PI * radius * radius;
        double circumference = 2 * Math.PI * radius;

        System.out.println("Radius: " + radius);
        System.out.println("Area: " + area);
        System.out.println("Circumference: " + circumference);
    }
}

public class CircleDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius: ");
        double radius = sc.nextDouble();

        Circle c = new Circle(radius);

    
        c.displayDetails();

        sc.close();
    }
}