package lesson17.task5;

public class Apple extends Fruit {
    private double price;

    public Apple(double weight, double price) {
        super(weight);
        this.price = price;
    }

    @Override
    public String toString() {
        return "Apple{} " + super.toString()+"  цена  "+this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;

    }

    public static void main(String[] args) {
        Apple apple1 = new Apple(0.2, 10.0);
        Apple apple2 = new Apple(0.25, 12.0);
        Apple apple3 = new Apple(0.3, 15.0);
        apple1.fruitCosts();
        apple2.fruitCosts();
        apple3.fruitCosts();
    }

    public void fruitCosts() {
        System.out.println(this.toString() + "  стоит  " + this.getWeight() * this.getPrice());
    }
}

