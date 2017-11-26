package lesson17.task5;

public abstract class Fruit {
    public double weight;

    public Fruit(double weight) {
        this.weight = weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {

        return weight;
    }

    @Override
    public String toString() {
        return
                "weight=" + weight;
    }

    public void printManufacturerInfo() {
        System.out.println("Made in Ukraine");
    }

    public void fruitCosts() {
    }
}