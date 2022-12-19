package com.techelevator.products;

import java.math.BigDecimal;

public class Drink extends Inventory implements textDisplay{

    public Drink(String vendPosition, String productName, BigDecimal price, String type) {
        super(vendPosition, productName, price, type);
    }

    @Override
    public String purchaseMessage(){
        return "Glug Glug, Yum!";
    }
}
