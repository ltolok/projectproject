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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flower flower = (Flower) o;

        if (storageTerm != flower.storageTerm) return false;
        return manufacturerCountry != null ? manufacturerCountry.equals(flower.manufacturerCountry) : flower.manufacturerCountry == null;
    }

    @Override
    public int hashCode() {
        int result = manufacturerCountry != null ? manufacturerCountry.hashCode() : 0;
        result = 31 * result + storageTerm;
        return result;
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
