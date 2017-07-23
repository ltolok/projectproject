package lesson9.com.company.professions;

public class Driver {
    public String fullName;
    public int experience;


    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getExperience() {

        return experience;
    }

    public String getFullName() {

        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Driver() {
    }

    ;

    public static void main(String[] args) {
        Driver driver = new Driver();
        driver.setFullName("Иванов Иван Иванович");
        driver.setExperience(10);
    }
}
