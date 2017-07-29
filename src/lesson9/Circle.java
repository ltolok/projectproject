package lesson9;

import java.lang.Math;
import java.util.Scanner;

public class Circle {
    private double radius;
    private double area, circumference;
    public static final double PI = Math.PI;

    public Circle() {
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;

        if (Double.compare(circle.radius, radius) != 0) return false;
        if (Double.compare(circle.area, area) != 0) return false;
        return Double.compare(circle.circumference, circumference) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(radius);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(area);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(circumference);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите радиус: ");
        double radius = sc.nextDouble();
        Circle circle = new Circle();
        circle.setRadius(radius);
        System.out.println("Площадь круга с радиусом" + "  " + circle.radius + "=  " + circle.area());
        System.out.println("Длина окружности с радиусом" + "  " + circle.radius + "=  " + circle.circumference);
        System.out.println(circle);
    }

    double area() {
        return area = PI * radius * radius;
    }

    double circumference() {
        return circumference = PI * 2 * radius;
    }
}



