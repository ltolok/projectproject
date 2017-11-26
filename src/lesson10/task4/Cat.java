package lesson10.task4;

public class Cat extends Animal {
    private static String noise = "Мяу";

    public Cat(String food, String location, String name) {
        super(food, location, name);
    }

    @Override
    public String toString() {
        return "кот " + super.toString();
    }

    public void makeNoise() {
        System.out.println("Кот мяукает: " + noise);
    }

    public void eat() {
        System.out.println("Кот ест " + getFood());
    }

    public void sleep() {
        System.out.println("Кот спит на диване в " + getLocation());
    }
}