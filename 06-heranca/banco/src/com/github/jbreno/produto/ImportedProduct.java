package com.github.jbreno.produto;

public class ImportedProduct extends Product {
    private Double customsFee;

    public ImportedProduct(){
        super();
    }

    public ImportedProduct(Double customsFee) {
        this.customsFee = customsFee;
    }

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    @Override
    public String priceTag(){
        StringBuilder str = new StringBuilder();
        str.append(this.getName());
        str.append(" $ ");
        str.append(this.totalPrice());
        str.append(" (Customs Fee: $ ");
        str.append(this.getCustomsFee() + ")\n");
        return str.toString();
    }

    public Double totalPrice() {
        return this.getPrice() + this.getCustomsFee();
    }
}
