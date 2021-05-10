package com.onc.demo.dataAccess.abstracts;

import com.onc.demo.entities.concretes.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDao extends JpaRepository<Product,Integer> {
}
