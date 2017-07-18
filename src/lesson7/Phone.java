package lesson7;

public class Phone {
    private int number;
    private String model;
    private double weight;
    private static int k;

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public double getWeight() {

        return weight;
    }

    public void setWeight(double weight) {

        this.weight = weight;
    }

    public String getModel() {

        return model;
    }

    public void setModel(String model) {

        this.model = model;
    }

    Phone(int n, String m, double w) {
        this();
        this.number = n;
        this.model = m;
        this.weight = w;
        k++;
    }

    Phone() {
        System.out.println("Телефон создался");
    }

    public static void main(String[] args) {
        Phone ph1 = new Phone(123456, "aa11", 0.5);
        Phone ph2 = new Phone(111111, "ff22", 0.8);
        Phone ph3 = new Phone();
                /*  ph1.number = 123456;
            ph1.model = "AB1020";
            ph1.weight = 0.1;

            ph2.number = 234567;
            ph2.model = "CD1020";
            ph2.weight = 0.15;*/

        ph3.setNumber(345678);
        ph3.setModel("A100");
        ph3.setWeight(0.16);

        receiveCall("Иван     ");
        ph2.getPhoneNumber();
        receiveCall("Александр", 456789);
        sendMessage(456784, 234675, 234986, 675342);
    }
    static void receiveCall(String name) {
        System.out.print("Звонит  " + name);
    }
    static void receiveCall(String name, int n) {
        System.out.println("Звонит  " + name + "   тел   " + n);
    }
    int getPhoneNumber() {
        System.out.println("Тел." + number);
        return number;
    }
    static void sendMessage(int... num) {
        for (int i = 0; i < num.length; i++) {
            System.out.println(" Тел. " + (i + 1) + ": " + num[i]);
        }
    }
}
