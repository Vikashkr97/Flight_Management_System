package com.company;
public class RegularTicket extends Ticket {

    private String special;

    public RegularTicket(String pnrNumber, String from,
                         String to, String departureTime, String arrivaltime,
                         int seatNumber, int price, Flight flight, Passanger passanger, String special) {
        super(pnrNumber, from, to, departureTime, arrivaltime, seatNumber, price, flight, passanger, false);
        this.special = special;
    }

    public String getSpecial() {
        return special;
    }

    public void updateSpecial(String special) {
        this.special = special;
    }
}