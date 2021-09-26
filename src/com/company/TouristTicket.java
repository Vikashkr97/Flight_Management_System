package com.company;
import java.util.ArrayList;

public class TouristTicket extends Ticket {

    String hotelAddress;
    ArrayList<String> locations;

    public TouristTicket(String pnrNumber, String from, String to, String departureTime,
                         String arrivaltime, int seatNumber, int price, Flight flight,
                         Passanger passanger, String hotelAddress, ArrayList<String> locations) {
        super(pnrNumber, from, to, departureTime, arrivaltime, seatNumber, price, flight, passanger, false);
        this.hotelAddress = hotelAddress;

        if (locations.size() <= 5)
            this.locations = locations;
        else
            setLocations(locations);
    }

    public ArrayList<String> getLocation() {
        return locations;
    }

    public void setLocations(ArrayList<String> location) {
        for (int i = 0; i < 5; i++) {
            this.locations.add(locations.get(i));
        }
    }

    public String addLocation(String location) {
        if (this.locations.size() < 5) {
            locations.add(location);
            return "Location " + location + "added";
        } else return "Only five location allowed";
    }

    public String removeLocation(String location) {
        if (this.locations.remove(location))
            return "Location Deleted";
        else
            return "Location : " + location + "doesn't exist in locations";
    }

    public String getHotelAddress() {
        return hotelAddress;
    }

    public void setHotelAddress(String hotelAddres) {
        this.hotelAddress = hotelAddres;
    }
}