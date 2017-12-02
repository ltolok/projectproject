package lesson17;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<String, Toy> map = new HashMap<>();
        Toy toy1 = new Toy("Doll", 4);
        Toy toy2 = new Toy("Box", 5);
        Toy toy3 = new Toy("Car", 7);
        map.put(toy1.getName(), toy1);
        map.put(toy2.getName(), toy2);
        map.put(toy3.getName(), toy3);
        mapValues(map);
        mapKeySet(map);
        mapEntrySet(map);
    }

    public static void mapValues(Map<String, Toy> map) {
        for (Toy toy : map.values()) {
            System.out.println(toy);
        }
    }

   public static void mapKeySet(Map<String, Toy> map) {
        for (String key : map.keySet()) {
            System.out.println(key + "  " + map.get(key));
        }
    }

    public static void mapEntrySet(Map<String, Toy> map) {
        for (Map.Entry entry : map.entrySet()) {
            System.out.println(entry);
        }
    }
}
