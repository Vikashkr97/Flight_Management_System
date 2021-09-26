package com.company;
 public class Passanger {
    public static int idCounter = 0;
    private int id;

    public class Contact {
        private String name;
        private String phoneNumber;
        private String emailID;

        public Contact(String name, String phoneNumber, String emailID) {
            this.name = name;
            this.phoneNumber = phoneNumber;
            this.emailID = emailID;
        }
    }

    public class Address {
        private String street;
        private String city;
        private String state;

        public Address(String street, String city, String state) {
            this.street = street;
            this.city = city;
            this.state = state;
        }
    }

    private Contact contact;
    private Address address;

    public Passanger(String name, String phoneNumber, String emailID, String street, String city, String state) {
        this.id = ++idCounter;

        this.address = new Address(street, city, state);
        this.contact = new Contact(name, phoneNumber, emailID);
    }

    public String getContactDetails() {
        return "Name: " + contact.name + ", Phone Number: " + contact.phoneNumber + ", Email ID: " + contact.emailID;
    }

    public String getAddressDetails() {
        return "Street: " + address.street + ", City: " + address.city + ", State: " + address.state;
    }

    public void updateContactDetails(String name, String phoneNumber, String emailID) {
        contact.name = name;
        contact.phoneNumber = phoneNumber;
        contact.emailID = emailID;
    }

    public void updateAddressDetails(String street, String city, String state) {
        address.street = street;
        address.city = city;
        address.state = state;
    }

    public static int getPassangerCount() {
        return idCounter;
    }

    public String getName() {
        return contact.name;
    }

    public void setName(String name) {
        contact.name = name;
    }

    public String getPhoneNumber() {
        return contact.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        contact.phoneNumber = phoneNumber;
    }

    public String getEmailID() {
        return contact.emailID;
    }

    public void setEmailID(String emailID) {
        contact.emailID = emailID;
    }

    public String getStreet() {
        return address.street;
    }

    public void setStreet(String street) {
        address.street = street;
    }

    public String getCity() {
        return address.city;
    }

    public void setCity(String city) {
        address.city = city;
    }

    public String getState() {
        return address.state;
    }

    public void setState(String state) {
        address.state = state;
    }

}