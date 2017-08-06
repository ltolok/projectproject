package lesson12;

public class Tie extends Clothing implements MensClothing {
    public void clotheaMan() {
        System.out.println("Галстук: " + "Цена  " + getCost() + "  цвет " + getColor());
    }
}
