package lesson10;

public abstract class Shape {
    String color;

    Shape() {
        color = "red";
    }

    ;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Shape shape = (Shape) o;

        return color != null ? color.equals(shape.color) : shape.color == null;
    }

    @Override
    public int hashCode() {
        return color != null ? color.hashCode() : 0;
    }

    public static void main(String[] args) {
    }

    abstract public void draw();

}
