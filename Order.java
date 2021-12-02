package com.cafe.order;
import com.cafe.menu.*;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<OrderItem> items = new ArrayList<OrderItem>();

    public void add(OrderItem orderItem) {items.add(orderItem);}

    public int cost(){
        int cost = 0;
        for(OrderItem orderItem : items){
            cost += orderItem.beverage.getPrice()*orderItem.quantity; }
        return cost;
    }

    public boolean setSize(String name, String size) {
        for (OrderItem orderItem : items) {
            if (orderItem.beverage.getName().equals(name)) {
                return orderItem.beverage.setSize(size);
            }
        }
        return false;
    }

    public void print() {
        String msg = "";
        for (int i =0; i<items.size();i++){
            msg += items.get(i)+"\n";
        }
        msg+= "Total:"+cost();
        System.out.println(msg);
    }
}
