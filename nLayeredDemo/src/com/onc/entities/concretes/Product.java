package com.onc.entities.concretes;

import com.onc.entities.abstracts.Entity;

public class Product implements Entity {
    private int id;
    private int categoryId;
    private String name;
    private double unitPrice;
    private int uniteInStock;

    public Product() {
    }
    public Product(int id, int categoryId, String name, double unitPrice, int uniteInStock) {
        this.id = id;
        this.categoryId = categoryId;
        this.name = name;
        this.unitPrice = unitPrice;
        this.uniteInStock = uniteInStock;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getUniteInStock() {
        return uniteInStock;
    }

    public void setUniteInStock(int uniteInStock) {
        this.uniteInStock = uniteInStock;
    }
}
