package lesson9.com.company.vehicles;

import lesson9.com.company.details.Engine;
import lesson9.com.company.professions.Driver;

public class Lorry extends Car {
    private int carrying;

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
        System.out.println("Автомобиль   " + getMarka() + " Класс  " + getCarClass() + " " + " Вес " + getWeight() + " грузоподъемность  " + this.carrying);
        System.out.println("Мощность" + getEngine().getPower() + "  Производитель  " + getEngine().getCompany());
        System.out.println("Водитель  " + getDriver().getFullName() + " Стаж вождения  " + getDriver().getExperience());
    }
}
