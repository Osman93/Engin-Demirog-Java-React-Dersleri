package com.onc.business.concretes;

import com.onc.business.abstracts.ProductService;
import com.onc.core.LoggerService;
import com.onc.dataAccess.abstracts.ProductDao;
import com.onc.entities.concretes.Product;

import java.util.List;

public class ProductManager implements ProductService {

    private ProductDao productDao;
    private LoggerService loggerService;

    public ProductManager(ProductDao productDao,LoggerService loggerService) {
        this.productDao = productDao;
        this.loggerService = loggerService;
    }

    @Override
    public void add(Product product) {
        if(product.getCategoryId() == 1){
            System.out.println("Bu kategoride ürün kabul edilmiyor");
            return ;
        }
        this.productDao.add(product);
        this.loggerService.logSystem(" Ürün loglandı : "+product.getName());

    }

    @Override
    public List<Product> getAll() {
        return null;
    }
}
