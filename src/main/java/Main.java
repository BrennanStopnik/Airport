public class Main {
    public static void main(String[] args) {

        Days day = Days.SUNDAY;
        System.out.println(day);

        Direction direction = Direction.NORTH;
        System.out.println(direction);

        Parking parking = new Parking("Long Term Parking", 69, 20);
        parking.setLot("Long Term Parking");
        parking.setStall(69);
        parking.setPrice(20);


        Passenger passenger = new Passenger();
        passenger.setName("John Doe");
        passenger.setAge(43);
        passenger.setSex("Male");
        passenger.setAssistance(false);
        passenger.setGuardian(false);
        passenger.setSecurity(true);

        TicketWindow ticketWindow = new TicketWindow(passenger.getName(), 100, "New York");
        ticketWindow.setPassenger(passenger.getName());
        ticketWindow.setPrice(100.00f);
        ticketWindow.setDestination("New York");

        Airline airline = new Airline("Delta", "Raleigh", "New York", 400);
        airline.setCompany("Delta");
        airline.setDeparture("Raleigh");
        airline.setArrival("New York");
        airline.setPrice(400);



        Employee[] employees = new Employee[5];
           employees[0] = new Employee("John", "Smith", "111-11-1111");
           employees[1] = new Employee("Kathy", "Smith", "222-22-2222");
           employees[2] = new Employee("Mark", "Smith", "333-33-3333");
           employees[3] = new Employee("Sue", "Smith", "444-44-4444");
           employees[4] = new Employee("Bob", "Smith", "555-55-5555");

        FoodCourt[] food = new FoodCourt[5];
            food[0] = new FoodCourt("Pizza", "Blaze", 10.00F);
            food[1] = new FoodCourt("Burger", "Five Guys", 8.00F);
            food[2] = new FoodCourt("Sandwich", "Subway", 6.00F);
            food[3] = new FoodCourt("Salad", "Chick Fil A", 4.00F);
            food[4] = new FoodCourt("Fries", "McDonald's", 2.00F);

        Airline[] airlines = new Airline[5];
            airlines[0] = new Airline("Delta", "Atlanta", "New York", 100.00F);
            airlines[1] = new Airline("American", "Dallas", "New York", 200.00F);
            airlines[2] = new Airline("Southwest", "Houston", "New York", 300.00F);
            airlines[3] = new Airline("United", "Chicago", "New York", 400.00F);
            airlines[4] = new Airline("JetBlue", "Los Angeles", "New York", 500.00F);
    }
}