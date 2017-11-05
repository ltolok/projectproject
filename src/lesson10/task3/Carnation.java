package lesson10.task3;

public class Carnation extends Flower {
    public Carnation(String country, int term) {
        super(country, term);
    }

    @Override
    public String toString() {
        return "Carnation{} " + super.toString();
    }

    public static void main(String[] args) {
        Flower carnation1 = new Carnation("Holland", 15);
        carnation1.price();
        System.out.println(carnation1.price());
        Flower carnation2 = new Carnation("Holland", 10);
        carnation1.price();
        System.out.println(carnation2.price());
        Flower carnation3 = new Carnation("Holland", 7);
        carnation1.price();
        System.out.println(carnation3.price());
    }

    public double price() {
        switch (this.getStorageTerm()) {
            case 15:
                return 20.00;
            case 10:
                return 15.00;
            case 7:
                return 10.00;
        }
        return 0.0;
    }
}

