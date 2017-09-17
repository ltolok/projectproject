package lesson16.task4;

import java.util.*;

public class Category {
    private String nameCategory;
    private SortedSet<Product> products;

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    public void setProducts(SortedSet<Product> products) {
        this.products = products;
    }

    public SortedSet<Product> getProducts() {

        return products;
    }

    public static void main(String[] args) {
        Category category1 = new Category();
        category1.setNameCategory("clothes");
        category1.setProducts(new TreeSet<>(new SortedByName()));
        category1.products.add(new Product("shirt", 299, 1));
        category1.products.add(new Product("pants", 399, 2));
        category1.products.add(new Product("jacket", 599, 3));
        category1.printСatalog(category1.products);

        Category category2 = new Category();
        category2.setNameCategory("footwear");
        category2.setProducts(new TreeSet<>(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                double price1 = o1.getPrice();
                double price2 = o2.getPrice();
                if (price1 > price2) {
                    return 1;
                } else if (price1 < price2) {
                    return -1;
                } else {
                    return 0;
                }
            }
        }));
        category2.products.add(new Product("shoes", 549, 1));
        category2.products.add(new Product("boots", 649, 2));
        category2.products.add(new Product("sneakers", 349, 3));
        category2.printСatalog(category2.products);

        Category category3 = new Category();
        category3.setNameCategory("accessories");
        category3.setProducts(new TreeSet<>(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                double rating1 = o1.getRating();
                double rating2 = o2.getRating();
                if (rating1 > rating2) {
                    return 1;
                } else if (rating1 < rating2) {
                    return -1;
                } else {
                    return 0;
                }
            }
        }));
        category3.products.add(new Product("belt", 400, 3));
        category3.products.add(new Product("purse", 500, 2));
        category3.products.add(new Product("aBag", 800, 1));
        category3.printСatalog(category3.products);
    }

    public void printСatalog(SortedSet<Product> products) {
        for (Product i : products) {
            System.out.println("Name: " + i.getName() +
                    " price: " + i.getPrice() +
                    " rating: " + i.getRating());
        }
        System.out.println();
    }
}
