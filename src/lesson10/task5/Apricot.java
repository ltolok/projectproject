package lesson10.task5;

public class Apricot extends Fruit {
    public double price;

    public Apricot(double weight, double price) {
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
        return "Apricot{" +
                "weight=" + weight +
                ", price=" + price +
                "} " + super.toString();
    }

    public double fruitCosts() {
        double fruitCosts = this.getWeight() * this.getPrice();
        System.out.println("Абрикос (вес " + this.getWeight() + " цена " + getPrice() + " грн )" + "стоит  " + fruitCosts + " грн");
        printManufacturerInfo();
        return fruitCosts;
    }
}