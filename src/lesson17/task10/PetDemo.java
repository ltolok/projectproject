package lesson17.task10;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PetDemo {
    public static void main(String[] args) {
        Map<String, Pet> pets = new HashMap<>();
        Pet map1 = new Cat("Murka", "house1");
        Pet map2 = new Dog("Rex", "house2");
        Pet map3 = new Parrot("Kesha", "house3");
        pets.put(map1.getName(), map1);
        pets.put(map2.getName(), map2);
        pets.put(map3.getName(), map3);
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
