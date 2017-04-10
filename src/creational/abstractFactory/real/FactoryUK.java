package creational.abstractFactory.real;

import creational.abstractFactory.real.Car.Car;
import creational.abstractFactory.real.Car.CarUK;
import creational.abstractFactory.real.Toys.Toy;
import creational.abstractFactory.real.Toys.ToyUK;

/**
 * Created by jackfrancisdalton on 06/04/17.
 */
public class FactoryUK extends RegionalFactory{
    private static int id = 1;
    public FactoryUK() {}

    @Override
    Car createCar(int topSpeed) {
        CarUK car = new CarUK(id, topSpeed);
        id++;
        return car;
    }

    @Override
    Toy createToy(String color) {
        ToyUK toy = new ToyUK(id, color);
        id++;
        return toy;
    }
}
