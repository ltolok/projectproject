package lesson10.task5;

public class Apple extends Fruit {
    private double price;

    public Apple(double weight, double price) {
        super(weight);
        this.price = price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Apple{} " + super.toString() + "  цена  " + this.price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Apple apple = (Apple) o;

        return Double.compare(apple.price, price) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(price);
        return (int) (temp ^ (temp >>> 32));
    }

    public double fruitCosts() {
        double fruitCosts = this.getWeight() * this.getPrice();
        System.out.println("Яблоко (вес " + this.getWeight() + " цена " + getPrice() + " грн )" + "стоит  " + fruitCosts + " грн");
        printManufacturerInfo();
        return fruitCosts;
    }
}

