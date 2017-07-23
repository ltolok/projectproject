package lesson10;

public class Circle extends Shape {
    int x,y,c;
    Circle(int a, int b, int r){
        x=a;
        y=b;
        c=r;
    }

    public static void main(String[] args) {
        Circle circle = new Circle(1,1, 2);
        circle.draw();

    }
    public void draw(){
        System.out.println("Рисую круг   " + x + "  "+ y + " "+"  " +c);
    };
}
