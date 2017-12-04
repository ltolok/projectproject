package lesson20;

import java.io.*;

public class Horse extends Animal implements Serializable {
    private Halter halter;

    public Horse(Halter halter) {
        this.halter = halter;
    }

    public static void main(String[] args) {
        Halter halter = new Halter();
        Horse horse = new Horse(halter);
        serialize(horse);
        deserializeHorse();
    }

    public static void serialize(Horse horse) {
        try {
            FileOutputStream fs = new FileOutputStream("C:\\Users\\mama\\Курсы\\project\\src\\lesson20\\testSer.ser");
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(horse);
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void deserializeHorse() {
        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\mama\\Курсы\\project\\src\\lesson20\\testSer.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Horse horse = new Horse(new Halter());
            horse = (Horse) ois.readObject();
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Ring size after serialization:  ");
    }
}