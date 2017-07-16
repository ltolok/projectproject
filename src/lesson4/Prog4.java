package lesson4;

public class Prog4 {
    public static void main(String[] args) {
        if (args[0].equals("1")) {
            System.out.println("Понедельник");
        } else if (args[0].equals("2")) {
            System.out.println("Вторник");
        } else if (args[0].equals("3")) {
            System.out.println("Среда");
        } else if (args[0].equals("4")) {
            System.out.println("Четверг");
        } else if (args[0].equals("5")) {
            System.out.println("Пятница");
        } else if (args[0].equals("6") || args[0].equals("7")) {
            System.out.println("Выходной");
        }
    }
}