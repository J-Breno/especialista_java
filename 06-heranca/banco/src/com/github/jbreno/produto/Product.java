package com.github.jbreno.produto;

public class Product {
    private String name;
    private Double price;

    public Product() {
    }

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String priceTag() {
        StringBuilder str = new StringBuilder();
        str.append(name);
        str.append(" $ ");
        str.append(price);
        str.append("\n");
        return str.toString();
    }
}
