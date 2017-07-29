package lesson9.com.company.details;

public class Engine {
    private int power;
    private String company;

    public Engine() {
    }

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

    public static void main(String[] args) {
        Engine engine = new Engine();
        engine.setPower(102);
        engine.setCompany("Япония");
    }
}
