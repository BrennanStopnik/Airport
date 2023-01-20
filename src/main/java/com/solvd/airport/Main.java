package com.solvd.airport;

import com.solvd.airport.enums.Days;
import com.solvd.airport.enums.Direction;
import com.solvd.airport.enums.Shift;
import com.solvd.airport.models.*;

public class Main {
    public static void main(String[] args) {

        // Create a new Passenger
        Passenger passenger = new Passenger("John Doe", "M", 43, false, false, true);

        // Create a new TicketWindow
        TicketWindow ticketWindow = new TicketWindow(passenger.getName(), 100, "New York");

        // Create a new Airline
        Airline airline = new Airline("Delta", "Raleigh", "New York", 400);

        // Create a new Parking
        Parking parking = new Parking("Long Term Parking", 69, 20);

        // Create a new Employee
        Employee employee = new Employee("John", "Smith", "111-11-1111");

        // Create a new FoodCourt
        FoodCourt foodCourt = new FoodCourt("Pizza", "Blaze", 10.00F);

        // Create a new Days
        Days day = Days.SUNDAY;

        // Create a new Direction
        Direction direction = Direction.NORTH;

        // Create a new Shift
        Shift shift = Shift.AFTERNOON;

        // Print out the Passenger
        System.out.println(passenger);

        // Print out the TicketWindow
        System.out.println(ticketWindow);

        // Print out the Airline
        System.out.println(airline);

        // Print out the Parking
        System.out.println(parking);

        // Print out the Employee
        System.out.println(employee);

        // Print out the FoodCourt
        System.out.println(foodCourt);

        // Print out the Days
        System.out.println(day);

        // Print out the Direction
        System.out.println(direction);

        // Print out the Shift
        System.out.println(shift);


    }
}