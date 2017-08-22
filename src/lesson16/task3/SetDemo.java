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
        System.out.println("Даны два множества:");
        printSet(cities);
        printSet(capitalCities);
        System.out.println("Оъединение множеств:");
        Set allcities = union(cities, capitalCities);
        printSet(allcities);
        Set interSection = intersect(cities, capitalCities);
        System.out.println("Пересечение множеств:");
        printSet(interSection);
    }

    public static Set union(Set set1, Set set2) {
        Set<Object> allSet = new HashSet();
        allSet.addAll(set1);
        allSet.addAll(set2);
        return allSet;
    }

    public static Set intersect(Set set1, Set set2) {
        set1.retainAll(set2);
        return set1;
    }

    static void printSet(Set set) {
        System.out.println(set);
    }
}