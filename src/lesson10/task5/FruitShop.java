package lesson10.task5;

public class FruitShop {
    private static double fruitCosts;
    private static double appleCosts;
    private static double apricotCosts;
    private static double pearCosts;

    public static double getFruitCosts() {
        return fruitCosts;
    }

    public static double getAppleCosts() {
        return appleCosts;
    }

    public static double getApricotCosts() {
        return apricotCosts;
    }

    public static double getPearCosts() {
        return pearCosts;
    }

    public static void setFruitCosts(double fruitCosts) {
        FruitShop.fruitCosts = fruitCosts;
    }

    public static void setAppleCosts(double appleCosts) {
        FruitShop.appleCosts = appleCosts;
    }

    public static void setApricotCosts(double apricotCosts) {
        FruitShop.apricotCosts = apricotCosts;
    }

    public static void setPearCosts(double pearCosts) {
        FruitShop.pearCosts = pearCosts;
    }

    public static void main(String[] args) {
        Apple apple = new Apple(0.2, 10.0);
        Apricot apricot = new Apricot(0.1, 25.0);
        Pear pear = new Pear(0.3, 20.0);
        appleCosts = apple.fruitCosts();
        fruitCosts = fruitCosts + appleCosts;
        apricotCosts = apricot.fruitCosts();
        fruitCosts = fruitCosts + apricotCosts;
        pearCosts = pear.fruitCosts();
        fruitCosts = fruitCosts + pearCosts;
        System.out.println("Общая стоимость проданных фруктов " + fruitCosts + " кг");
        System.out.println("Яблок продано " + appleCosts + " кг");
        System.out.println("Абрикос продано " + apricotCosts + " кг");
        System.out.println("Груш продано " + pearCosts + " кг");
    }
}
