package lesson12;

public class Tshirt extends Clothing implements MensClothing, WomensClothing {
    public void clotheaMan() {
        clotheprint();
    }

    public void clotheaWomen() {
        clotheprint();
    }

    public void clotheprint() {
        System.out.println("Футболка:   " + "Размер " + getSize().getEuroSize() + "  (" + getSize().getDescription() + ")" + "   цена  " + getCost() + "  цвет " + getColor());
    }
}

