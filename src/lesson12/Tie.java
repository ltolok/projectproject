package lesson12;

public class Tie extends Clothing implements MensClothing {
    @Override
    public String toString() {
        return "Галстук: " + "   цена  " + getCost() + "  цвет " + getColor();
    }

    public void clotheaMan() {
        System.out.println(toString());
    }
}
