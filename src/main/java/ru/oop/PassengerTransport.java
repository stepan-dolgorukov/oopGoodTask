package ru.oop;

/**
 * Пассажирский транспорт.
 */
public interface PassengerTransport extends Positioned {

    /**
     * Довезти пассажира в ближайшее к точке назначения место, доступное для транспорта.
     */
    void takeClosest(Person passenger, Position destination);
}
