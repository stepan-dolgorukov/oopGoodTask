package ru.oop;

public class Bus implements PassengerTransport, Positioned {
    private Position position_;
    private String route_;

    public Bus() {

    }

    public Bus(String route) {
    }

    public void takeClosest(Person passenger, Position destination) {

    }

    public Position getPosition() {
        return position_;
    }

    public String getRoute() {
        return route_;
    }

    public void setPosition(Position position) {

    }
}