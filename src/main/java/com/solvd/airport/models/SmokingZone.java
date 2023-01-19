package com.solvd.airport.models;

public class SmokingZone {
    private final int capacity;
    private final String open;

    public SmokingZone(int howBig, String isOpen){
        this.capacity = howBig;
        this.open = isOpen;
    }

    @Override
    public String toString(){
        return "The smoking section can hold " + this.capacity + " and " + this.open + "."
    ;}

}
