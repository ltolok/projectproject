package lesson9;

import java.lang.Math;
import java.util.Scanner;

public class Circle {
    double radius;
    static double area, circumference;
    public static final double PI = Math.PI;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {

        return radius;
    }

    Circle() {
    }

    ;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите радиус: ");
        double radius = sc.nextDouble();
        Circle circle = new Circle();
        circle.setRadius(radius);
        area = circle.area();
        System.out.println("Площадь круга с радиусом" + "  " + circle.radius + "=  " + area);
        circumference = circle.circumference();
        System.out.println("Длина окружности с радиусом" + "  " + circle.radius + "=  " + circumference);
    }

    public double area() {
        return area = PI * radius * radius;
    }

    public double circumference() {
        return circumference = PI * 2 * radius;
    }
}



