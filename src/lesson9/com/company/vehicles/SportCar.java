package lesson9.com.company.vehicles;

import lesson9.com.company.details.Engine;
import lesson9.com.company.professions.Driver;

public class SportCar extends Car {
    private int speed;

    public SportCar() {
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {

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
        System.out.println("Автомобиль   " + getMarka() + " Класс  " + getCarClass() + " " + " Вес " + getWeight() + " Максимальная скорость  " + getSpeed());
        System.out.println("Мощность" + getEngine().getPower() + "  Производитель  " + getEngine().getCompany());
        System.out.println("Водитель  " + getDriver().getFullName() + " Стаж вождения  " + getDriver().getExperience());
    }
}
