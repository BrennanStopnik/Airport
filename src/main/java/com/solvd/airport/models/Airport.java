package com.solvd.airport.models;

public class Airport implements IArrive, IDepart {
    private String name;
    private String location;
    private String size;
    private String type;

    public Airport(String airportName, String airportLocation, String airportSize, String airportType){
        this.name = airportName;
        this.location = airportLocation;
        this.size = airportSize;
        this.type = airportType;
    }
    private String getName(){
        return this.name;
    }
    private String getLocation(){
        return this.location;
    }
    private String getSize(){
        return this.size;
    }
    private String getType(){
        return this.type;
    }
    private void setName(String name){
        this.name = name;
    }
    private void setLocation(String location){
        this.location = location;
    }
    private void setSize(String size){
        this.size = size;
    }
    private void setType(String type){
        this.type = type;
    }

    @Override
    public String toString(){
        return "The Classes.Airport is " + this.name + " and is located in " + this.location + ". It is a " + this.size + " airport and is a " + this.type + " airport.";
    }

    @Override
    public void arrivingStatus() {
        System.out.println("I arrived by " + IArrive.cameBy);
    }

    @Override
    public void depart() {
        System.out.println("I departed by " + IDepart.wentBy);
    }
    @Override
    public void departureTime() {
        System.out.println("Departure time is " + IDepart.time);
    }
}
