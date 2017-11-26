package lesson10.task4;

public class Dog extends Animal {
    private static String noise = "Гав";

    @Override
    public String toString() {
        return "собака  " + super.toString();
    }

    public Dog(String food, String location, String name) {
        super(food, location, name);
    }

    public void makeNoise() {
        System.out.println("Собака лает:  " + noise);
    }

    public void eat() {
        System.out.println("Собака ест " + getFood());
    }

    public void sleep() {
        System.out.println("Собака спит в " + getLocation());
    }
}
