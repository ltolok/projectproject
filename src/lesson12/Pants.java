package lesson12;

public class Pants extends Clothing implements MensClothing, WomensClothing {
    public void clotheaMan() {
        clotheprint();
    }

    public void clotheaWomen() {
        clotheprint();
    }

    public void clotheprint() {
        System.out.println("Брюки:   " + "Размер " + getSize().getEuroSize() + "  (" + getSize().getDescription() + ")" + "   цена  " + getCost() + "  цвет " + getColor());
    }
}
