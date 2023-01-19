package com.solvd.airport.models;

public class TicketWindow {
    private String passenger;
    private float price;
    private String destination;

    public TicketWindow(String passName, float ticketPrice, String passDestination){
        this.passenger = passName;
        this.price = ticketPrice;
        this.destination = passDestination;

    }
    private String getPassenger(){
        return this.passenger;
    }
    private float getPrice(){
        return this.price;
    }
    private String getDestination(){
        return this.destination;
    }

    public void setPassenger(String passenger){
        this.passenger = passenger;
    }
    public void setPrice(float price){
        this.price = price;
    }
    public void setDestination(String destination){
        this.destination = destination;
    }



    @Override
    public String toString(){
        return "Ticket for: " + this.passenger + "\nPrice: " + this.price + "\nDestination: " + this.destination
    ;}
}
