package com.cafe.menu;
public abstract class Beverage {
    public static final int TALL = 0;
    public static final int GRANDE = 1;
    public static final int VENTI = 2;

    String name;
    int basePrice;
    int size;

    public Beverage (String name, int bPrice, int size){
        this.name = name;
        this.basePrice = bPrice;
        this.size = size;
    }

    public String getName() { return name; }

    public int getPrice() { return basePrice; }

    public boolean setSize(int size) {
      if (this.size==0 && size==1) {this.basePrice+=500;}
        else if (this.size==0 && size==2) {this.basePrice+=1000;}
        else if (this.size==1 && size==2) {this.basePrice+=500;}
        this.size = size;
        return true;
    }

    @Override
    public String toString() {
        if (size==0) {return "name=" + name + ", Price=" + getPrice() + ", size=TALL" ;}
        else if (size==1) {return "name=" + name + ", Price=" + getPrice() + ", size=GRANDE" ;}
        else if (size==2) {return "name=" + name + ", Price=" + getPrice() + ", size=VENTI" ;}
        else {return "name=" + name + ", Price=" + getPrice() + ", size=TALL" ;}
    }

    public boolean setSize(String size){
        if ("TALL".equals(size)){
            return setSize(TALL);}
        else if ("GRANDE".equals(size)){
            return setSize(GRANDE);}
        else if ("VENTI".equals(size)) {
            return setSize(VENTI);}
        return false;
    }
}

