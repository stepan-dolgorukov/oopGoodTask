package ru.oop;

/**
 * Автобус.
 */
public class Bus implements PassengerTransport {
    private Position position_;
    private String route_;

    public Bus() {

    }

    /**
     * @param route наименование маршрута, по которому ходит автобус
     */
    public Bus(String route) {
    }

    /**
     * Довезти пассажира на автобусе до места назначения.
     * Если маршрут не проходит через конечный пункт,
     * довезти до ближайшей к пункту остановки.
     */
    public void takeClosest(Person passenger, Position destination) {

    }

    public Position getPosition() {
        return position_;
    }

    public void setPosition(Position position) {

    }

    /**
     * Получить наименование маршрута автобуса.
     */
    public String getRoute() {
        return route_;
    }
}