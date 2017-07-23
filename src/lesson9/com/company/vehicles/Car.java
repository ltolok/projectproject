package lesson9.com.company.vehicles;

import lesson9.com.company.professions.Driver;
import lesson9.com.company.details.Engine;

public class Car {
    public String marka;
    public  char carClass;
    public double weight;
    public Driver driver;
    public Engine engine;

    Car(){};

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
        car.printInfo();
        car.start();
        car.turnRight();
        car.turnLeft();
        car.stop();
    }

    void start() {
        System.out.println("Поехали");
    }

    void stop() {
        System.out.println("Останавливаемся");
    }

    void turnRight() {
        System.out.println("Поворот направо");
    }

    void turnLeft(){
        System.out.println("Поворот налево");}

    void printInfo() {
        System.out.println("Автомобиль   "+this.marka+" Класс  "+this.carClass + " "+ " Вес "+this.weight);
        System.out.println("Мощность"+ this.engine.getPower() +"  Производитель  "+ this.engine.getCompany());
        System.out.println("Водитель  "+this.driver.getFullName()+" Стаж вождения  "+this.driver.getExperience());
    }
}
