package lesson4;

public class MySecondApp {
    public static void main(String[] args) {
        int count = 0;
        double sum = 0;
        for (String str : args) {
            System.out.println(count++ + " аргумент = " + str);
            sum = sum + Double.parseDouble(str);
        }
        sum = sum / count;
        System.out.println("Среднее значение равно =  " + sum);
    }
}
