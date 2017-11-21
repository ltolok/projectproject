package lesson10.task3;

public class Bouquet {
    static int quantity = 0;
    private double price = 0;

    @Override
    public String toString() {
        return "Bouquet{" +
                "price=" + price +
                '}';
    }

    public Bouquet(Flower flower, int k) {
        price = flower.price() * k;
        System.out.println("Цена букета из " + k + "  " + flower.toString() + "  =  " + price);
        quantity = quantity + k;
    }

    public Bouquet(Flower[] f) {
        Flower[] flowers = new Flower[f.length];
        System.arraycopy(f, 0, flowers, 0, f.length);
        quantity = quantity + flowers.length;
        for (int i = 0; i < flowers.length; i++) {
            price = price + flowers[i].price();
        }
        System.out.println("Цена букета из : ");
        for (Flower fq : flowers) {
            System.out.println(fq);
        }
        System.out.println("= " + price);
    }

    public static void main(String[] args) {
        Bouquet[] bouquets = new Bouquet[3];
        bouquets[0] = new Bouquet(new Rose("Ecuador", 10), 7);
        bouquets[1] = new Bouquet(new Carnation("Holland", 15), 9);
        Flower[] flowers = new Flower[5];
        flowers[0] = new Peony("Ukraine", 7);
        flowers[1] = new Peony("Ukraine", 7);
        flowers[2] = new Peony("Ukraine", 7);
        flowers[3] = new Tulip("Poland", 7);
        flowers[4] = new Tulip("Poland", 7);
        bouquets[2] = new Bouquet(flowers);
        System.out.println("Всего продано " + quantity + "  цветов");
    }
}