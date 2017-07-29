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
        Phone phone1 = new Phone(123456, "aa11", 0.5);
        Phone phone2 = new Phone(111111, "ff22", 0.8);
        Phone phone3 = new Phone();
        phone3.setNumber(345678);
        phone3.setModel("A100");
        phone3.setWeight(0.16);
        phone1.receiveCall("Иван     ");
        phone2.getPhoneNumber();
        phone3.receiveCall("Александр", 456789);
        phone1.sendMessage(456784, 234675, 234986, 675342);
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
        for (int i = 0; i < num.length; i++) {
            System.out.println(" Тел. " + (i + 1) + ": " + num[i]);
        }
    }
}
