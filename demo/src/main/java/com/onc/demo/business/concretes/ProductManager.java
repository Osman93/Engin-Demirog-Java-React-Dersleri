package com.onc.demo.business.concretes;

import com.onc.demo.business.abstracts.ProductService;
import com.onc.demo.dataAccess.abstracts.ProductDao;
import com.onc.demo.entities.concretes.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductManager implements ProductService {

    private ProductDao productDao ;

    @Autowired
    public ProductManager(ProductDao productDao) {
        this.productDao = productDao;
    }

    @Override
    public List<Product> getAll() {
        return productDao.findAll();
    }
}
