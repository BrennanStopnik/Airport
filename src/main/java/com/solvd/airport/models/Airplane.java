package com.solvd.airport.models;

import com.solvd.airport.interfaces.IVehicle;

public class Airplane implements IVehicle {
    private int capacity;
    private int tailNumber;

    public Airplane(int capacity, int tailNumber){
        this.capacity = capacity;
        this.tailNumber = tailNumber;
    }

    public int getCapacity(){
        return this.capacity;
    }
    public int getTailNumber(){
        return this.tailNumber;
    }

    public void setCapacity(int capacity){
        this.capacity = capacity;
    }
    public void setTailNumber(int tailNumber){
        this.tailNumber = tailNumber;
    }

    public void boardingStatus() {
        System.out.println("Boarded the plane.");
    }

    public void boardingTime() {
        System.out.println("Boarding time starts in 30 minutes.");
    }

    @Override
    public String getVehicleType() {
        return null;
    }

    @Override
    public String setVehicleType() {
        return null;
    }

    @Override
    public String getVehicleCapacity() {
        return null;
    }

    @Override
    public String setVehicleCapacity() {
        return null;
    }

    @Override
    public String getVehicleId() {
        return null;
    }

    @Override
    public String setVehicleId() {
        return null;
    }
}
