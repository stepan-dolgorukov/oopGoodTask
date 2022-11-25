package ru.oop;

/**
 * Пассажирский транспорт.
 */
public interface PassengerTransport extends Positioned {

    void takeClosest(Person passenger, Position destination);
}
