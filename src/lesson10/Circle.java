package lesson10;

public class Circle extends Shape {
    private int x, y, c;

    public Circle(String color, int a, int b, int r) {
        super(color);
        x = a;
        y = b;
        c = r;
    }

    public void setC(int c) {

        this.c = c;
    }

    public int getC() {

        return c;
    }

    public void setY(int y) {

        this.y = y;
    }

    public int getY() {

        return y;
    }

    public void setX(int x) {

        this.x = x;
    }

    public int getX() {

        return x;
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
        Circle circle = new Circle("red", 1, 1, 2);

        circle.draw();

    }

    void draw() {
        System.out.println("Рисую круг   " + getColor() + "  " + x + "  " + y + " " + "  " + c);
    }
}
