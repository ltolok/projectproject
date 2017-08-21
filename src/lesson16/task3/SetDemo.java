package lesson16.task3;

import lesson16.City;

import java.util.HashSet;
import java.util.Set;


public class SetDemo {
    public static void main(String[] args) {
        Set<City> cities = new HashSet<City>();
        cities.add(new City("Vein"));
        cities.add(new City("Berlin"));
        cities.add(new City("Paris"));
        cities.add(new City("Warsaw"));
        cities.add(new City("Munich"));
        cities.add(new City("Salzburg"));
        Set<City> capitalCities = new HashSet<City>();
        capitalCities.add(new City("Vein"));
        capitalCities.add(new City("London"));
        capitalCities.add(new City("Paris"));
        capitalCities.add(new City("Warsaw"));
        System.out.println(cities);
        System.out.println(capitalCities);
        Set allcities = union(cities, capitalCities);
        System.out.println(allcities);

    }

    public static Set union(Set set1, Set set2) {
        Set<Object> result = new HashSet<Object>();
        result.addAll(set1);
        result.addAll(set2);
        return result;
    }
}