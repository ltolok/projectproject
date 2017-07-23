package lesson10;


import java.util.Arrays;

public class Rectangle extends Shape {
    public int x1, y1, x2, y2;
    String shape[];

    Rectangle(int a, int b, int a1, int b1) {
        x1 = a;
        y1 = b;
        x2 = a1;
        y2 = b1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Rectangle rectangle = (Rectangle) o;

        if (x1 != rectangle.x1) return false;
        if (y1 != rectangle.y1) return false;
        if (x2 != rectangle.x2) return false;
        if (y2 != rectangle.y2) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(shape, rectangle.shape);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + x1;
        result = 31 * result + y1;
        result = 31 * result + x2;
        result = 31 * result + y2;
        result = 31 * result + Arrays.hashCode(shape);
        return result;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(1, 1, 5, 5);
        // rectangle.draw();
        Shape[] figure = new Shape[2];
        figure[0] = new Circle(2, 5, 4);
        figure[1] = new Rectangle(1, 1, 5, 5);
        for (Shape shape : figure) {
            shape.draw();
        }
    }

    public void draw() {
        System.out.println("Рисую прямоугольник   " + x1 + " " + y1 + " " + x2 + "  " + y2);
    }
}
