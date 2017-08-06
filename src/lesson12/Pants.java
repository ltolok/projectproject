package lesson12;

public class Pants extends Clothing implements MensClothing, WomensClothing {
    public void clotheaMan() {
        System.out.println("Мужские брюки: ");
        System.out.println("Размер " + getSize().getEuroSize() + "   цена  " + getCost() + "  цвет " + getColor());
    }

    public void clotheaWomen() {
        System.out.println("Женские брюки:");
        System.out.println("Размер " + getSize().getEuroSize() + "   цена  " + getCost() + "  цвет " + getColor());
    }
}
