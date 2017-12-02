package lesson20;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Horse extends Animal {
    public Horse() {
    }

    public static void main(String[] args) {
        Halter halter = new Halter();
        Horse horse = new Horse();
        serialize(horse);
        //Horse deserializeHorse = deserializeHorse();
    }

    public static void serialize(Horse horse) {
        try {
            FileOutputStream fs = new FileOutputStream("testSer.ser");
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(horse);
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void deserializeHorse() {
        try {
            FileInputStream fis = new FileInputStream("testSer.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Horse horse = (Horse) ois.readObject();
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Ring size after serialization:  ");
    }
}