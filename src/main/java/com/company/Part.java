package com.company;

import java.util.List;

public class Part {
    private String name;
    private double price;
    private int quantity;
    private List<PricesParts> pricesParts;

    public Part(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void showPart() {
        System.out.println("####################################");
        System.out.println("Part name: " + name);
        System.out.println("Part price: " + price);
        System.out.println("Number of parts: " + quantity);
        System.out.println("####################################");
    }

    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
