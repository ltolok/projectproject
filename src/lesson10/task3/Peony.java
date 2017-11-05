package lesson10.task3;

public class Peony extends Flower {
    Peony(String country, int term) {
        super(country, term);
    }

    @Override
    public String toString() {
        return "Peony{} " + super.toString();
    }

    public static void main(String[] args) {
        Flower peony1 = new Peony("Ukraine", 7);
        peony1.price();
        System.out.println(peony1.price());
        Flower peony2 = new Peony("Ukraine", 6);
        peony2.price();
        System.out.println(peony2.price());
        Flower peony3 = new Peony("Ukraine", 5);
        peony3.price();
        System.out.println(peony3.price());
    }

    public double price() {
        switch (this.getStorageTerm()) {
            case 7:
                return 10.00;
            case 6:
                return 8.00;
            case 5:
                return 6.00;
        }
        return 0.0;
    }
}

