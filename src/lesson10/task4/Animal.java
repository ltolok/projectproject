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
        return "по имени  " + name;
    }
    public void makeNoise() {System.out.println("Животное издает характерный звук");
    }
    public void eat() {System.out.println("Животное ест");
    }
    public void sleep() {System.out.println("Животное спит");
    }
}
