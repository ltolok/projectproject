package lesson9.com.company.vehicles;

import lesson9.com.company.details.Engine;
import lesson9.com.company.professions.Driver;


public class SportCar extends Car {
    public int speed;

    public SportCar() {
        super();
    }

    ;

    public void setSpeed(int carrying) {
        this.speed = carrying;
    }

    public int getCarrying() {

        return speed;
    }

    public static void main(String[] args) {
        SportCar lorry = new SportCar();
        lorry.setSpeed(300);
        lorry.setMarka("Ferrari");
        lorry.setCarClass('S');
        lorry.setWeight(115);
        Driver driver = new Driver();
        driver.setFullName("Александров Александр Иванович");
        driver.setExperience(12);
        Engine engine = new Engine();
        engine.setPower(150);
        engine.setCompany("Италия");
        lorry.setDriver(driver);
        lorry.setEngine(engine);
        lorry.printInfo();
    }

    void printInfo() {
        System.out.println("Автомобиль   " + this.marka + " Класс  " + this.carClass + " " + " Вес " + this.weight + " Максимальная скорость  " + this.speed);
        System.out.println("Мощность" + this.engine.getPower() + "  Производитель  " + this.engine.getCompany());
        System.out.println("Водитель  " + this.driver.getFullName() + " Стаж вождения  " + this.driver.getExperience());
    }
}
