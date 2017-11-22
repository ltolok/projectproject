package lesson17.task10;

import java.util.HashMap;
import java.util.Map;

public class Pet {
    public String name;

    public Pet(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {

        return name;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Map<String, Pet> map = new HashMap<>();
        Pet map1 = new Cat("Murka");
        Pet map2 = new Dog("Rex");
        Pet map3 = new Parrot("Kesha");
        map.put(map1.getName(), map1);
        map.put(map2.getName(), map2);
        map.put(map3.getName(), map3);

        for (Pet pet : map.values()) {
            System.out.println(pet.toString());
        }
        for (String key : map.keySet()) {
            System.out.println(key);
        }
        for (Map.Entry entry : map.entrySet()) {
            System.out.println(entry);
        }
    }
}

