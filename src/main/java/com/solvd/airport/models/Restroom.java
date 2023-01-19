package com.solvd.airport.models;

public abstract class Restroom {
    private String  sex;
    private boolean available;
    private boolean clean;

    public Restroom(String mOrF, boolean avail, boolean isItClean){
        this.sex = mOrF;
        this.available = avail;
        this.clean = isItClean;
    }

    @Override
    public String toString() {return "The" + this.sex + "restroom is clean: " + this.clean + " and available " + this.available + ".";}

}
