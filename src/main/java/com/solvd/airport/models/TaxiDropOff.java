package com.solvd.airport.models;

public abstract class TaxiDropOff {
    private int price;

    public TaxiDropOff(int taxiPrice){
        this.price = taxiPrice;
    }

    public int getPrice() {
        return this.price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public abstract String toString();
}
