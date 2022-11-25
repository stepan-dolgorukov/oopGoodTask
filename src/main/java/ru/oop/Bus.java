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
     * Довезти пассажира на автобусе до места назначения.
     * Если маршрут не проходит через конечный пункт,
     * довезти до ближайшей к пункту остановки.
     */
    public void takeClosest(Person passenger, Position destination) {

    }

    /**
     * Получить текущее месторасположение автобуса.
     */
    public Position getPosition() {
        return position_;
    }

    /**
     * Получить название маршрута автобуса.
     */
    public String getRoute() {
        return route_;
    }

    /**
     * Обновить месторасположение автобуса.
     */
    public void setPosition(Position position) {

    }
}