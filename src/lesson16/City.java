package lesson16;

public class City {
    private String city;

    public City(String s) {
        this.city = s;
    }

    @Override
    public String toString() {
        return "City{" +
                "city='" + city + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        City city1 = (City) o;

        return city != null ? city.equals(city1.city) : city1.city == null;
    }

    @Override
    public int hashCode() {
        return city != null ? city.hashCode() : 0;
    }

    public void setCity(String city) {

        this.city = city;
    }

    public String getCity() {

        return city;
    }
}