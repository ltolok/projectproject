package lesson10.task4;

public class Animal {
    public String food, location, name;

    public Animal(String food, String location, String name) {
        this.food = food;
        this.location = location;
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getFood() {
        return food;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                '}';
    }

    public void makeNoise() {
    }

    public void eat() {
    }

    void sleep() {
    }
}
