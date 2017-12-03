package lesson10        .task5;

public class Apple extends Fruit {
    private double price;

    public Apple(double weight, double price) {
        super(weight);
        this.price = price;
    }

    @Override
    public String toString() {
        return "Apple{} " + super.toString() + "  цена  " + this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public double fruitCosts() {
        double fruitCosts = this.getWeight() * this.getPrice();
        System.out.println("Яблоко (вес " + this.getWeight() + " цена " + getPrice() + " грн )" + "стоит  " + fruitCosts + " грн");
        printManufacturerInfo();
        return fruitCosts;
    }
}

