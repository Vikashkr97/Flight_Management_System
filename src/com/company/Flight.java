<<<<<<< HEAD
package com.company;
public class Flight {
    private String flightNumber;
=======

  private String flightNumber;
>>>>>>> a751e6f1139b4617de78d8ab294a6fbb1764af3c
    private String airline;
    private int capacity;
    private int seatBooked;

    public Flight(String flightNumber, String airline, int capacity, int seatBooked) {
        this.flightNumber = flightNumber;
        this.airline = airline;
        this.capacity = capacity;
        this.seatBooked = seatBooked;
    }

    public String getFlightDetails() {
        return "Flight Number: " + this.flightNumber + ", Airline: " + this.airline +
                ", Capacity: " + this.capacity + ", Seat Booked: " + this.seatBooked;
    }

    public String checkAvalibilty() {
        if (capacity > seatBooked)
            return "Available";
        else
            return "Not available";
    }
    public String getFlightNumber() {
        return flightNumber;
    }

    public String getAirline() {
        return airline;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getSeatBooked() {
        return seatBooked;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setSeatBooked(int seatBooked) {
        this.seatBooked = seatBooked;
    }
<<<<<<< HEAD
}
=======
}
}
>>>>>>> a751e6f1139b4617de78d8ab294a6fbb1764af3c
