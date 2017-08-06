package lesson12;

public class Skirt extends Clothing implements WomensClothing {
    public void clotheaWomen() {
        System.out.println("Одеть женщину");
        System.out.println("Юбка:"+"Размер " + getSize().getEuroSize() + "   цена  " + getCost() + "  цвет " + getColor());
    }
}