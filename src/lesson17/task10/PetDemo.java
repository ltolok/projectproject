package lesson17.task10;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PetDemo {
    public static void main(String[] args) {
        Map<String, Pet> pets = new HashMap<>();
        Pet cat = new Cat("Murka", "house1");
        Pet dog = new Dog("Rex", "house2");
        Pet parrot = new Parrot("Kesha", "house3");
        pets.put(cat.getName(), cat);
        pets.put(dog.getName(), dog);
        pets.put(parrot.getName(), parrot);
        iterateKeys(pets);
        System.out.println(pets.get("Murka"));
    }

    private static void iterateKeys(Map<String, Pet> pets) {
        Set<String> keys = pets.keySet();
        for (String key : keys) {
            System.out.println(key);
        }
    }
}
