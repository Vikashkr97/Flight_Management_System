package com.company;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Passanger passanger = new Passanger("Shruti", "7999483026", "namdeo.shruti3006@gmail.com", "15", "Jabalpur", "Madhya Pradesh");

        System.out.println(passanger.getContactDetails());
        System.out.println(passanger.getAddressDetails());

        Flight flight = new Flight("ac-141", "spicejet", 25, 1);

        System.out.println(flight.getFlightDetails());

        if (flight.getCapacity() > flight.getSeatBooked()) {
            RegularTicket regularTicket = new RegularTicket("Reg-125", "Jabalpur", "Hyderabad",
                    "14/01/2021 10:00:00", "14/01/2021 16:00:00",
                    5, 2200, flight, passanger, "food");
            System.out.println("Regular Ticket for passanger " + passanger.getName() + " is booked");
            printTicketDetails(regularTicket);
        } else {
            System.out.println("No seat available");
        }

        ArrayList<String> location = new ArrayList<String>(Arrays.asList("filpcart", "Ajio", "Bragg", "Amazon"));

        if (flight.getCapacity() > flight.getSeatBooked()) {
            TouristTicket touristTicket = new TouristTicket("Tou-123", "Jabalpur", "Mumbai",
                    "12/01/2021 10:00:00", "12/01/2021 14:00:00",
                    12, 2000, flight, passanger, "vijan place, Gandhi Nagar, Mumbai", location);
            System.out.println("Tourist Ticket for passanger " + passanger.getName() + " is booked");

            printTicketDetails(touristTicket);
        } else {
            System.out.println("No seat available");
        }

    }

    public static void printTicketDetails(Ticket ticket) {
        System.out.println("PNR Number: " + ticket.getPnrNumber());
    }
}