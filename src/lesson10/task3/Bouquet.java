package lesson10.task3;


import java.util.Arrays;

public class Bouquet {
    private static int quantity = 0;
    private Flower flower;
    private int number;
    private Flower[] flowers = new Flower[5];

    public Bouquet(Flower flower, int number) {
        this.flower = flower;
        this.number = number;
    }

    public Bouquet(Flower[] f) {
        this.number = f.length;
        System.arraycopy(f, 0, this.flowers, 0, this.number);

    }

    public static int getQuantity() {
        return quantity;
    }

    public Flower getFlower() {
        return flower;
    }

    public int getNumber() {
        return number;
    }

    public Flower[] getFlowers() {
        return flowers;
    }

    public static void setQuantity(int quantity) {
        Bouquet.quantity = quantity;
    }

    public void setFlower(Flower flower) {
        this.flower = flower;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setFlowers(Flower[] flowers) {
        this.flowers = flowers;
    }

    public static void main(String[] args) {
        Bouquet[] bouquets = new Bouquet[3];
        bouquets[0] = new Bouquet(new Rose("Эквадор", 10), 7);
        bouquets[0].bouquetPrice();
        bouquets[1] = new Bouquet(new Carnation("Голландия", 15), 9);
        bouquets[1].bouquetPrice();
        Flower[] flowers = new Flower[5];
        flowers[0] = new Peony("Украина", 7);
        flowers[1] = new Peony("Украина", 7);
        flowers[2] = new Peony("Украина", 7);
        flowers[3] = new Tulip("Польша", 7);
        flowers[4] = new Tulip("Польша", 7);
        bouquets[2] = new Bouquet(flowers);
        bouquets[2].bouquetPrice2();
        System.out.println("Всего продано " + quantity + "  цветов");
    }

    public void bouquetPrice() {
        System.out.println("Цена букета из" + flower.toString() + "  " + "  =  " + flower.price() * this.number);
        quantity = quantity + this.number;
    }

    public void bouquetPrice2() {
        quantity = quantity + this.number;
        double price = 0;
        for (int i = 0; i < this.number; i++) {
            price = price + flowers[i].price();
        }
        System.out.println("Цена букета из : ");
        for (Flower fq : flowers) {
            System.out.println(fq);
        }
        System.out.println("= " + price);
    }
}