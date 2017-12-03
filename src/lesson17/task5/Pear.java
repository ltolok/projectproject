package lesson17.task5;

public class Pear extends Fruit {
    private double price;

    public Pear(double weight, double price) {
        super(weight);
        this.price = price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Pear{" +
                "weight=" + weight +
                ", price=" + price +
                "} " + super.toString();
    }

    public double getPrice() {

        return price;
    }

    public double fruitCosts() {
        double fruitCosts = this.getWeight() * this.getPrice();
        System.out.println("Груша (вес " + this.getWeight() + " цена " + getPrice()+" грн )" + "стоит  " + fruitCosts+" грн");
        printManufacturerInfo();
        return fruitCosts;
    }
}
