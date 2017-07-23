package lesson10;

public class Circle extends Shape {
    int x, y, c;

    Circle(int a, int b, int r) {
        x = a;
        y = b;
        c = r;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Circle circle = (Circle) o;

        if (x != circle.x) return false;
        if (y != circle.y) return false;
        return c == circle.c;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + x;
        result = 31 * result + y;
        result = 31 * result + c;
        return result;
    }

    public static void main(String[] args) {
        Circle circle = new Circle(1, 1, 2);
        circle.draw();

    }

    public void draw() {
        System.out.println("Рисую круг   " + x + "  " + y + " " + "  " + c);
    }

    ;
}
