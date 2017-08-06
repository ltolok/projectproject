package lesson12;

public class Tshirt extends Clothing implements MensClothing, WomensClothing {
    public void clotheaMan() {
        System.out.println("Одеть мужчину :");
        clotheprint();
    }

    public void clotheaWomen() {
        System.out.println("Одеть женщину :");
        clotheprint();
    }
    public void clotheprint() {
        System.out.println("Футболка :" + "размер " + getSize().getEuroSize() + "   цена  " + getCost() + "  цвет " + getColor());
    }
}

