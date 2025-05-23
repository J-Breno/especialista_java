package com.github.jbreno.produto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ImportedProduct imp = new ImportedProduct();
        UsedProduct used  = new UsedProduct();
        Product product = new Product();
        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.printf("Product #%d data: ", i + 1);
            System.out.print("Common, used or imported (c/u/i)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Price: ");
            Double price = sc.nextDouble();
            if (ch == 'i') {
                System.out.print("Customs fee: ");
                Double customsFee = sc.nextDouble();
                imp = new ImportedProduct(name, price, customsFee);
            } else if (ch == 'u') {
                System.out.print("Manufactore date (DD/MM/YYYY): )");
                String date = sc.next();
                used = new UsedProduct(name, price, date);
            } else if (ch == 'c') {
                product = new Product(name, price);
            }
        }

        System.out.println("PRICE TAGS");


        sc.close();
    }
}
