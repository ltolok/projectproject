package lesson17.task4;

import java.util.*;

public class Category {
    private String name;
    private SortedSet<Product> products;

    @Override
    public String toString() {
        return "Category{" +
                "name='" + name + '\'' +
                ", products=" + products +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Category category = (Category) o;

        if (name != null ? !name.equals(category.name) : category.name != null) return false;
        return products != null ? products.equals(category.products) : category.products == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (products != null ? products.hashCode() : 0);
        return result;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {

        return name;
    }

    public void setProducts(SortedSet<Product> products) {
        this.products = products;
    }

    public SortedSet<Product> getProducts() {

        return products;
    }

    public static void main(String[] args) {
        Category category1 = new Category();
        category1.setName("clothes");
        category1.setProducts(new TreeSet<>(new SortedByName()));
        category1.products.add(new Product("shirt", 299, 1));
        category1.products.add(new Product("pants", 399, 2));
        category1.products.add(new Product("jacket", 599, 3));
        category1.printСatalog(category1.products);

        Category category2 = new Category();
        category2.setName("footwear");
        category2.setProducts(new TreeSet<>(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                double price1 = o1.getPrice();
                double price2 = o2.getPrice();
                return (int) (price1 - price2);
            }
        }));
        category2.products.add(new Product("shoes", 549, 1));
        category2.products.add(new Product("boots", 649, 2));
        category2.products.add(new Product("sneakers", 349, 3));
        category2.printСatalog(category2.products);

        Category category3 = new Category();
        category3.setName("accessories");
        category3.setProducts(new TreeSet<>(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                int rating1 = o1.getRating();
                int rating2 = o2.getRating();
                return (rating1 - rating2);
            }
        }));
        category3.products.add(new Product("belt", 400, 3));
        category3.products.add(new Product("purse", 500, 2));
        category3.products.add(new Product("aBag", 800, 1));
        category3.printСatalog(category3.products);
    }

    public void printСatalog(SortedSet<Product> products) {
        for (Product product : products) {
            System.out.println("Name: " + product.getName() +
                    " price: " + product.getPrice() +
                    " rating: " + product.getRating());
        }
        System.out.println();
    }
}
