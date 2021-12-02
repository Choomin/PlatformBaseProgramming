package com.cafe.order;
import com.cafe.menu.*;

public class OrderItem {
    Beverage beverage;
    int quantity;

    public OrderItem(Beverage ber, int quan) {
        this.beverage = ber;
        this.quantity = quan;
    }

    @Override
    public String toString() {
        return "[ "+ beverage.toString() + ", quantity=" + quantity+" ]" ;
    }
}