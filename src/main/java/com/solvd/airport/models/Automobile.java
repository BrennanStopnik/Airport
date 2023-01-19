package com.solvd.airport.models;

import com.solvd.airport.interfaces.IVehicle;

public class Automobile implements IVehicle {
    private String vehicleType;
    private String vehicleCapacity;
    private String vehicleId;

    public Automobile(String vehicleType, String vehicleCapacity, String vehicleId){
        this.vehicleType = vehicleType;
        this.vehicleCapacity = vehicleCapacity;
        this.vehicleId = vehicleId;
    }

    public String getVehicleType(){
        return this.vehicleType;
    }

    @Override
    public String setVehicleType() {
        return null;
    }

    public String getVehicleCapacity(){
        return this.vehicleCapacity;
    }

    @Override
    public String setVehicleCapacity() {
        return null;
    }

    public String getVehicleId(){
        return this.vehicleId;
    }

    @Override
    public String setVehicleId() {
        return null;
    }

    public void setVehicleType(String vehicleType){
        this.vehicleType = vehicleType;
    }
    public void setVehicleCapacity(String vehicleCapacity){
        this.vehicleCapacity = vehicleCapacity;
    }
    public void setVehicleId(String vehicleId){
        this.vehicleId = vehicleId;
    }

    @Override
    public String toString(){ return "Vehicle type" + this.vehicleType + "Vehicle capacity" + this.vehicleCapacity + "Vehicle id" + this.vehicleId;}
}
