package com.solvd.airport.models;

public class Parking {
    private String lot;
    private int stall;
    private int price;

    public Parking(String parkingLot, int stallNum, int parkingPrice) {
        this.lot = parkingLot;
        this.stall = stallNum;
        this.price = parkingPrice;
    }

    public String getLot() {
        return lot;
    }

    public void setLot(String lot) {
        this.lot = lot;
    }

    public int getPrice() {

        return this.price;
    }
    public void setPrice(int price) {

        this.price = price;
    }

    public int getStall() {

        return this.stall;
    }
    public void setStall(int stall) {

        this.stall = stall;
    }

    @Override
    public String toString() {

        return "Classes.Parking [price=" + price + ", stall=" + stall + "]";
    }
}
