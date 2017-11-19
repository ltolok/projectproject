package lesson10.task4;

public class Horse extends Animal {
    private static String noise = "Иго-го";

    @Override
    public String toString() {
        return "Horse{} " + super.toString();
    }

    public Horse(String food, String location, String name) {
        super(food, location, name);
    }

    public void makeNoise() {
        System.out.println("Лошадь ржет:  " + noise);
    }

    public void eat() {
        System.out.println("Лошадь ест " + getFood());
    }

    public void sleep() {
        System.out.println("Лошадь спит в " + getLocation());
    }
}
