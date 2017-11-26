package lesson10.task3;

public class Tulip extends Flower {
    public Tulip(String country, int term) {
        super(country, term);
    }

    @Override
    public String toString() {
        return "Тюльпан " + super.toString();
    }

    public static void main(String[] args) {
        Flower tulip1 = new Tulip("Польша", 7);
        tulip1.price();
        System.out.println(tulip1.price());
        Flower tulip2 = new Tulip("Польша", 5);
        tulip1.price();
        System.out.println(tulip2.price());
        Flower tulip3 = new Tulip("Польша", 3);
        tulip1.price();
        System.out.println(tulip2.price());
    }

    public double price() {
        switch (this.getStorageTerm()) {
            case 7:
                return 15.00;
            case 5:
                return 10.00;
            case 3:
                return 5.00;
        }
        return 0.0;
    }
}

