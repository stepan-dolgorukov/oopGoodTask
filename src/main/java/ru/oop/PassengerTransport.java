package ru.oop;

/**
 * Пассажирский транспорт.
 */
public interface PassengerTransport extends Transport {

    /**
     * Довезти пассажира как можно ближе к пункту назначения.
     * Нет гарантий, что после перевозки пассажир окажется точно в destination.
     *
     * @param passenger пассажир, которого требуется перевезти
     * @param destination местоположение пункта назначения
     */
    public void takeClosest(Person passenger, Position destination);
}
