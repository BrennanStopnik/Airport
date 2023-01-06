public class TicketWindow extends Luggage {
    private String passenger;
    private float price;
    private String destination;

    public TicketWindow(String passName, float ticketPrice, String passDestination){
        super(1, 20);
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

    void setPassenger(String passenger){
        this.passenger = passenger;
    }
    void setPrice(float price){
        this.price = price;
    }
    void setDestination(String destination){
        this.destination = destination;
    }



    @Override
    public String toString(){
        return "Ticket for: " + this.passenger + "\nPrice: " + this.price + "\nDestination: " + this.destination
    ;}
}
