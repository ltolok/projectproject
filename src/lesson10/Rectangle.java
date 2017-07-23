package lesson10;


public class Rectangle extends Shape {
   public int x1, y1, x2, y2;
    String shape[];

    Rectangle(int a, int b, int a1, int b1) {
        x1 = a;
        y1 = b;
        x2 = a1;
        y2 = b1;
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
    public  void draw() {
        System.out.println("Рисую прямоугольник   " + x1 + " " + y1 + " " + x2 + "  " + y2);
    }
}
