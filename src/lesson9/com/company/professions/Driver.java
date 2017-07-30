package lesson9.com.company.professions;

import lesson8.Person;

public class Driver extends Person {
    private int experience;

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }

    public static void main(String[] args) {
        Driver driver = new Driver();
        driver.setExperience(10);
        driver.setFullName("Крутой Дмитрий Александрович");
        driver.setAge(35);
    }
}
