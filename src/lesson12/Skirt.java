package lesson12;

public class Skirt extends Clothing implements WomensClothing {
    @Override
    public String toString() {
        return "Юбка : Размер  " + getSize().getEuroSize() + "  (" + getSize().getDescription() + ")" + "   цена  " + getCost() + "  цвет " + getColor();
    }

    public void clotheaWomen() {
        System.out.println(toString());
    }
}