package com.onc.demo.api.controllers;
import com.onc.demo.business.abstracts.ProductService;
import com.onc.demo.business.concretes.ProductManager;
import com.onc.demo.entities.concretes.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/products")
public class ProductsController {

    private ProductService productService;

    @Autowired
    public ProductsController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/getall")
    public List<Product> getAll(){
        System.out.println("Products get all");
        return this.productService.getAll();
    }
}
