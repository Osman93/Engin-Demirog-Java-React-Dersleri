package com.onc;

import com.onc.business.abstracts.ProductService;
import com.onc.business.concretes.ProductManager;
import com.onc.core.JLoggerManagerAdapter;
import com.onc.dataAccess.concretes.HibernateProductDao;
import com.onc.dataAccess.concretes.XinjProductDao;
import com.onc.entities.concretes.Product;
import com.onc.jLogger.JLoggerManager;

public class Main {

    public static void main(String[] args) {
	    // Todo spring ioc ile çözülecek
        ProductService productService = new ProductManager(new XinjProductDao(),new JLoggerManagerAdapter(new JLoggerManager()));
        Product product = new Product(1,2,"Lenova",3469.9,100);
        productService.add(product);
    }
}
