package lesson10.task3;

public abstract class Flower {
    private String manufacturerCountry;
    private int storageTerm;

    public Flower(String manufacturerCountry, int storageTerm) {
        this.manufacturerCountry = manufacturerCountry;
        this.storageTerm = storageTerm;
    }

    @Override
    public String toString() {
        return "(Цветок из " + manufacturerCountry +
                " срок годности " + storageTerm+" дней)";
    }

    public void setManufacturerCountry(String manufacturerCountry) {
        this.manufacturerCountry = manufacturerCountry;
    }

    public String getManufacturerCountry() {
        return manufacturerCountry;
    }

    public int getStorageTerm() {
        return storageTerm;
    }

    public void setStorageTerm(int storageTerm) {
        this.storageTerm = storageTerm;
    }

    public abstract double price();
}
