package lesson10.task3;

public class Rose extends Flower {
    public Rose(String country, int term) {
        super(country, term);
    }

    @Override
    public String toString() {
        return "Rose{} " + super.toString();
    }

    public static void main(String[] args) {
        Flower rose1 = new Rose("Ecuador", 10);
        rose1.price();
        System.out.println(rose1.price());
        Flower rose2 = new Rose("Ecuador", 8);
        rose2.price();
        System.out.println(rose2.price());
        Flower rose3 = new Rose("Ecuador", 5);
        rose3.price();
        System.out.println(rose3.price());
    }

    public double price() {
        switch (this.getStorageTerm()) {
            case 10:
                return 30.00;
            case 8:
                return 20.00;
            case 5:
                return 10.00;
        }
        return 0.0;
    }
}