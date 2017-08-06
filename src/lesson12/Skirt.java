package lesson12;

public class Skirt extends Clothing implements WomensClothing {
    public void clotheaWomen() {
        System.out.println("Юбка:" + "Размер " + getSize().getEuroSize() + "  (" + getSize().getDescription() + ")" + "   цена  " + getCost() + "  цвет " + getColor());
    }
}