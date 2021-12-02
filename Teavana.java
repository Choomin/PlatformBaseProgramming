package com.cafe.menu;
public class Teavana extends Beverage {
    private int amount = TALL;

    public Teavana(String name){
        super(name,4100,TALL);
    }

    @Override
    public boolean setSize(int size){
        if (size!=amount){
            super.setSize(size);

            return true;
        }
        return false;
    }
}
