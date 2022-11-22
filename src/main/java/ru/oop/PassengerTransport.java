package ru.oop;

public interface PassengerTransport extends Positioned {

    void takeClosest(Person passenger, Position destination);
}
