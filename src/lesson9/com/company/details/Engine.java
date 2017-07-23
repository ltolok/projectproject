package lesson9.com.company.details;

import jdk.nashorn.internal.parser.Scanner;

public class Engine {
    public int power;
    public String company;

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCompany() {

        return company;
    }

    public void setPower(int power) {

        this.power = power;
    }

    public double getPower() {

        return power;
    }

    public Engine() {
    }

    ;

    public static void main(String[] args) {
        Engine engine = new Engine();
        engine.setPower(102);
        engine.setCompany("Япония");
    }
}
