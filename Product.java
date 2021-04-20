package com.company;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Product implements Comparable<Product> {

    private String Name = null;
    private int price = -1;
    private final boolean Instock ;

    public Product(String Name, int price ,boolean Instock ) {
        this.Name= Name;
        this.price = price;
        this.Instock = Instock;
    }
    public String getName() {
        return Name;
    }
    @Override
    public int compareTo(Product o) {
        return this.price - o.price;
    }



    @Override
    public String toString() {
        return "Product : " + Name + " - " + price + " - " + Instock +  "\n";
    }
}