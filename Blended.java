package com.cafe.menu;
public class Blended extends Beverage {

    private int baseAmount=GRANDE;

    public Blended (String name) {super(name,6300,GRANDE);}

    @Override
    public boolean setSize(int size){
        if(size==baseAmount) {
            super.setSize(size);
            return true;
        }
        return false;
    }
}

