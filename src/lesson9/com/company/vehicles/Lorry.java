package lesson9.com.company.vehicles;

import lesson9.com.company.details.Engine;
import lesson9.com.company.professions.Driver;

public class Lorry extends Car {
    public int carrying;

    public Lorry() {
        super();
    }

    ;

    public void setCarrying(int carrying) {
        this.carrying = carrying;
    }

    public int getCarrying() {

        return carrying;
    }

    public static void main(String[] args) {
        Lorry lorry = new Lorry();
        lorry.setCarrying(120);
        lorry.setMarka("Man");
        lorry.setCarClass('T');
        lorry.setWeight(100);
        Driver driver = new Driver();
        driver.setFullName("Петров Федор Иванович");
        driver.setExperience(7);
        Engine engine = new Engine();
        engine.setPower(122);
        engine.setCompany("Германия");
        lorry.setDriver(driver);
        lorry.setEngine(engine);
        lorry.printInfo();
    }

    void printInfo() {
        System.out.println("Автомобиль   " + this.marka + " Класс  " + this.carClass + " " + " Вес " + this.weight + " грузоподъемность  " + this.carrying);
        System.out.println("Мощность" + this.engine.getPower() + "  Производитель  " + this.engine.getCompany());
        System.out.println("Водитель  " + this.driver.getFullName() + " Стаж вождения  " + this.driver.getExperience());
    }
}
