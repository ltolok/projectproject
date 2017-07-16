package lesson7;

public class Phone {
    int number;
    String model;
    double weight;

    Phone(int n, String m, double w) {
        this();
        number = n;
        model = m;
        weight = w;
    }

    Phone() {
        System.out.println("Телефон создался");
        // number = 456789;
        // model = "ss345";
        // weight = 0.3;
    }

    public static void main(String[] args) {
        Phone ph1 = new Phone(123456, "aa11", 0.5);
        Phone ph2 = new Phone(111111, "ff22", 0.8);
        Phone ph3 = new Phone();
        String name;
        //  ph1.number = 123456;
        //  ph1.model = "AB1020";
        //  ph1.weight = 0.1;

        //  ph2.number = 234567;
        //  ph2.model = "CD1020";
        //  ph2.weight = 0.15;

        ph3.number = 345678;
        ph3.model = "A100";
        ph3.weight = 0.16;


        ph1.receiveCall("Иван     ");
        ph2.getPhoneNumber();
        ph3.receiveCall("Александр", 456789);
        ph1.sendMessage(456784, 234675, 234986);
    }

    void receiveCall(String name) {
        System.out.print("Звонит  " + name);

    }

    void receiveCall(String name, int n) {
        System.out.println("Звонит  " + name + "   тел   " + n);

    }

    int getPhoneNumber() {
        System.out.println("Тел." + number);
        return number;
    }

    void sendMessage(int... num) {
        for(int i = 0; i < num.length; i++) {
            System.out.println(" Тел. " + i + ": " + num[i]);
        }
    }
}
