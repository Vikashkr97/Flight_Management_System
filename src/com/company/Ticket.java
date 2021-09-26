package com.company;
import java.time.LocalDateTime;

public abstract class Ticket {
    Flight flight;
    Passanger passanger;
    private String pnrNumber;
    private String from;
    private String to;
    private String departureTime;
    private String arrivalTime;
    private int seatNumber;
    private int price;
    private boolean cancalled;

    public Ticket(String pnrNumber,
                  String from,
                  String to,
                  String departureTime,
                  String arrivalTime,
                  int seatNumber,
                  int price,
                  Flight flight,
                  Passanger passanger,
                  boolean cancalled) {
        this.pnrNumber = pnrNumber;
        this.from = from;
        this.to = to;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.seatNumber = seatNumber;
        this.price = price;
        this.flight = flight;
        this.passanger = passanger;
        this.cancalled = cancalled;

        flight.setSeatBooked(flight.getSeatBooked() + 1);
    }

    public int getFlightDuration() {
        LocalDateTime departure = LocalDateTime.parse(departureTime);
        LocalDateTime arrival = LocalDateTime.parse(arrivalTime);
        int days = arrival.getDayOfMonth() - departure.getDayOfMonth();
        int totalHours = (days * 24) + arrival.getHour() - departure.getHour();

        return totalHours;
    }

    public String checkStatus() {
        if (cancalled) return "Confirmed";
        else return "Cancelled";
    }

    public void cancelTicket() {
        this.cancalled = true;
    }

    public String getPnrNumber() {
        return pnrNumber;
    }

    public void setPnrNumber(String pnrNumber) {
        this.pnrNumber = pnrNumber;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}