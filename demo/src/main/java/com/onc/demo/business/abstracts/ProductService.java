package com.onc.demo.business.abstracts;

import com.onc.demo.entities.concretes.Product;
import java.util.List;

public interface ProductService {
    List<Product> getAll();
}
