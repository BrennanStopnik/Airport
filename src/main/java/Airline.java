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
    void setCompany(String company){
        this.company = company;
    }
    void setDeparture(String departure){
        this.departure = departure;
    }
    void setArrival(String arrival){
        this.arrival = arrival;
    }
    void setPrice(float price){
        this.price = price;
    }


    @Override
    public String toString(){
        return "The Airline is " + this.company;
    }
}
