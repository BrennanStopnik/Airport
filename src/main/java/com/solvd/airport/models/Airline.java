package com.solvd.airport.models;

public class Airline {
    private String company;
    private String departure;
    private String arrival;
    private float price;

    public Airline(String airlineCompany, String departureCity, String arrivalCity, float ticketPrice){
        this.company = airlineCompany;
        this.departure = departureCity;
        this.arrival = arrivalCity;
        this.price = ticketPrice;
    }
    private String getCompany(){
        return this.company;
    }
    private String getDeparture(){
        return this.departure;
    }
    private String getArrival(){
        return this.arrival;
    }
    private float getPrice(){
        return this.price;
    }
    public void setCompany(String company){
        this.company = company;
    }
    public void setDeparture(String departure){
        this.departure = departure;
    }
    public void setArrival(String arrival){
        this.arrival = arrival;
    }
    public void setPrice(float price){
        this.price = price;
    }


    @Override
    public String toString(){
        return "The Classes.Airline is " + this.company;
    }
}
