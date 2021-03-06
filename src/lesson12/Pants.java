package lesson12;

public class Pants extends Clothing implements MensClothing, WomensClothing {
    @Override
    public String toString() {
        return "Брюки: Размер  " + getSize().getEuroSize() + "  (" + getSize().getDescription() + ")" + "   цена  " + getCost() + "  цвет " + getColor();
    }

    public void clotheaMan() {
        clothPrint();
    }

    public void clotheaWomen() {
        clothPrint();
    }

    public void clothPrint() {
        System.out.println(toString());
    }
}
