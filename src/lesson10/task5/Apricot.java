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
                "weight=" + getWeight() +
                ", price=" + price +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Apricot apricot = (Apricot) o;

        return Double.compare(apricot.price, price) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(price);
        return (int) (temp ^ (temp >>> 32));
    }

    public double fruitCosts() {
        double fruitCosts = this.getWeight() * this.getPrice();
        System.out.println("Абрикос (вес " + this.getWeight() + " цена " + getPrice() + " грн )" + "стоит  " + fruitCosts + " грн");
        printManufacturerInfo();
        return fruitCosts;
    }
}