package lesson17;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        Map<String, Toy> map = new TreeMap<>();
        Toy toy1 = new Toy("Doll", 4);
        Toy toy2 = new Toy("Box", 5);
        Toy toy3 = new Toy("Car", 7);
        map.put(toy1.getName(), toy1);
        map.put(toy2.getName(), toy2);
        map.put(toy3.getName(), toy3);

        for (Toy toy : map.values()) {
            System.out.println(toy);
        }
        for (String key : map.keySet()) {
            System.out.println(key);
        }
        for (Map.Entry entry : map.entrySet()) {
            System.out.println(entry);
        }
    }
}
