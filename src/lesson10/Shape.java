package lesson10;

public abstract class Shape {
    private String color;

    public Shape(String cl) {
        color = cl;
    }


    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {

        return color;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                '}';
    }

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

    abstract void draw();

}
