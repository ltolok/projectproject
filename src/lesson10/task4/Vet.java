package lesson10.task4;

public class Vet {
    public static void main(String[] args) {
        Animal[] animal = new Animal[3];
        animal[0] = new Cat("молоко", "дом", "Мурзик");
        animal[1] = new Dog("мясо", "будка", "Рекс");
        animal[2] = new Horse("сено", "конюшня", "Гром");
        for (Animal a : animal) {
            treatAnimal(a);
        }
    }

    public static void treatAnimal(Animal animal) {
        System.out.println("На приеме у ветеринара   " + animal);
        animal.makeNoise();
        animal.eat();
        animal.sleep();
    }
}
