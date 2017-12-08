package lesson17.task4;

import java.util.Comparator;

public class SortedByName implements Comparator<Product> {
    public int compare(Product o1, Product o2) {
        String str1 = o1.getName();
        String str2 = o2.getName();
        return str1.compareTo(str2);
    }
}
