package ru.oop;

/**
 * Автобус.
 */
public class Bus implements PassengerTransport, Positioned {
    private Position position_;
    private String route_;

    public Bus() {

    }

    public Bus(String route) {
    }

    /**
     * Довезти пассажира до места назначения.
     * Если маршрут не проходит через конечный пункт,
     * довезти до ближайшей к пункту остановки.
     */
    public void takeClosest(Person passenger, Position destination) {

    }

    /**
     * Получить текущее месторасположение.
     */
    public Position getPosition() {
        return position_;
    }

    /**
     * Получить название маршрута.
     */
    public String getRoute() {
        return route_;
    }

    /**
     * Обновить месторасположение.
     */
    public void setPosition(Position position) {

    }
}