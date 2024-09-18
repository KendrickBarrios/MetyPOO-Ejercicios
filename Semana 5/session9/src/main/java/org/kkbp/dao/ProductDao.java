package org.kkbp.dao;

import org.kkbp.interfaces.Session9;
import org.kkbp.models.Product;

import java.util.ArrayList;

public class ProductDao implements Session9 {
    ArrayList<Product> products = new ArrayList<>();

    @Override
    public boolean store(Object object) {
        Product product = (Product)object;
        products.add(product);
        return true;
    }

    @Override
    public void findByName(String name) {
        for (Product product : products) {
            if (product.getName().equals(name)) {
                System.out.println("Product found");
            }
        }
    }
}
