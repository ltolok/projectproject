package lesson10.task3;

import java.util.Arrays;

public class Bouquet {
    private static int quantity = 0;
    private Flower[] bouqet = new Flower[15];

    public Bouquet(Flower flower, int k) {
        bouqet = new Flower[k];
        Arrays.fill(bouqet, flower);
    }

    public Bouquet(Flower[] f) {
        bouqet = new Flower[f.length];
        System.arraycopy(f, 0, this.bouqet, 0, f.length);
    }

    public static int getQuantity() {
        return quantity;
    }

    public Flower[] getBouqet() {
        return bouqet;
    }

    public static void setQuantity(int quantity) {
        Bouquet.quantity = quantity;
    }

    public void setBouqet(Flower[] bouqet) {
        this.bouqet = bouqet;
    }

    @Override
    public String toString() {
        return "Bouquet{" +
                "bouqet=" + Arrays.toString(bouqet) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bouquet bouquet = (Bouquet) o;

        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(bouqet, bouquet.bouqet);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(bouqet);
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
        bouquets[2].bouquetPrice();
        System.out.println("Всего продано " + quantity + "  цветов");
    }

    public void bouquetPrice() {
        quantity = quantity + bouqet.length;
        double price = 0;
        for (int i = 0; i < bouqet.length; i++) {
            price = price + bouqet[i].price();
        }
        System.out.println("Цена букета из : ");
        for (Flower fq : bouqet) {
            System.out.println(fq);
        }
        System.out.println("= " + price);
    }
}