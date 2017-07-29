package lesson9.com.company.vehicles;

import lesson9.com.company.professions.Driver;
import lesson9.com.company.details.Engine;

public class Car {
    private String marka;
    private char carClass;
    private double weight;
    private Driver driver;
    private Engine engine;

    public Car() {
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getMarka() {
        return marka;
    }

    public void setCarClass(char carClass) {
        this.carClass = carClass;
    }

    public char getCarClass() {
        return carClass;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.setMarka("Toyota Corolla");
        car.setCarClass('C');
        car.setWeight(1100);

        Driver driver = new Driver();
        driver.setFullName("Петров Федор Иванович");
        driver.setExperience(7);

        Engine engine = new Engine();
        engine.setPower(122);
        engine.setCompany("Германия");

        car.setDriver(driver);
        car.setEngine(engine);

        car.printInfo();
        car.start();
        car.turnRight();
        car.turnLeft();
        car.stop();
    }

    private void start() {
        System.out.println("Поехали");
    }

    private void stop() {
        System.out.println("Останавливаемся");
    }

    private void turnRight() {
        System.out.println("Поворот направо");
    }

    private void turnLeft() {
        System.out.println("Поворот налево");
    }

    void printInfo() {
        System.out.println("Автомобиль   " + getMarka() + " Класс  " + getCarClass() + " " + " Вес " + getWeight());
        System.out.println("Мощность" + engine.getPower() + "  Производитель  " + engine.getCompany());
        System.out.println("Водитель  " + driver.getFullName() + " Стаж вождения  " + driver.getExperience());
    }
}
