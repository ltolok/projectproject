package lesson12;

public class Pants extends Clothing implements MensClothing, WomensClothing {
    @Override
    public String toString() {
        return "Брюки: Размер  " + getSize().getEuroSize() + "  (" + getSize().getDescription() + ")" + "   цена  " + getCost() + "  цвет " + getColor();
    }

    public void clotheaMan() {
        clotheprint();
    }

    public void clotheaWomen() {
        clotheprint();
    }

    public void clotheprint() {
        System.out.println(toString());
    }
}
