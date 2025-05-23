package com.github.jbreno.produto;

import java.util.Date;

public class UsedProduct extends Product {
    private String manufactureDate;

    public UsedProduct() {
        super();
    }

    public UsedProduct(String manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public UsedProduct(String name, Double price, String manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String priceTag() {
        StringBuilder str = new StringBuilder();
        str.append(this.getName());
        str.append(" (used) $ ");
        str.append(this.getPrice());
        str.append(" (manufacture date: ");
        str.append(this.manufactureDate);
        str.append(")\n");
        return str.toString();
    }
}
