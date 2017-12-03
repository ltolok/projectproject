package lesson10.task5;

public class Pear extends Fruit {
    private double price;

    public Pear(double weight, double price) {
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
        return "Pear{" +
                "weight=" + getWeight() +
                ", price=" + price +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Pear pear = (Pear) o;

        return Double.compare(pear.price, price) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    public double fruitCosts() {
        double fruitCosts = this.getWeight() * this.getPrice();
        System.out.println("Груша (вес " + this.getWeight() + " цена " + getPrice() + " грн )" + "стоит  " + fruitCosts + " грн");
        printManufacturerInfo();
        return fruitCosts;
    }
}
