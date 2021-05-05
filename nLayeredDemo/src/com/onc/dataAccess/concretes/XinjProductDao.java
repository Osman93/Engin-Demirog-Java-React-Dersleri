package com.onc.dataAccess.concretes;

import com.onc.dataAccess.abstracts.ProductDao;
import com.onc.entities.concretes.Product;

import java.util.List;

public class XinjProductDao implements ProductDao {
    @Override
    public void add(Product product) {
        System.out.println("Xinj ile eklendi : "+product.getName());
    }

    @Override
    public void update(Product product) {

    }

    @Override
    public void delete(Product product) {

    }

    @Override
    public Product get(int id) {
        return null;
    }

    @Override
    public List<Product> getAll() {
        return null;
    }
}
