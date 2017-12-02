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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Animal animal = (Animal) o;

        if (food != null ? !food.equals(animal.food) : animal.food != null) return false;
        if (location != null ? !location.equals(animal.location) : animal.location != null) return false;
        return name != null ? name.equals(animal.name) : animal.name == null;
    }

    @Override
    public int hashCode() {
        int result = food != null ? food.hashCode() : 0;
        result = 31 * result + (location != null ? location.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    public void makeNoise() {
        System.out.println("Животное издает характерный звук");
    }

    public void eat() {
        System.out.println("Животное ест");
    }

    public void sleep() {
        System.out.println("Животное спит");
    }
}
