package com.company;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestSorting {
    public static void main(String[] args)
    {
        Product p1 = new Product("Carrot", 10, true);
        Product p2 = new Product("Banana Half Dozen", 20, false);
        Product p3 = new Product("Banana Dozen", 40, true);

        List<Product> products = new ArrayList<Product>();
        products.add(p2);
        products.add(p3);
        products.add(p1);
        // UnSorted List
        System.out.println(products);

        Collections.sort(products);

        // Default Sorting by product price
        System.out.println("Products After Sorting based on Price \n");

        System.out.println(products);

        Collections.sort(products, new NameSorter());

        // Sorted by Name
        System.out.println("Products Aster Sorting based on Name \n");
        System.out.println(products);

    }
}
