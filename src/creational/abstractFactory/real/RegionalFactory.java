package creational.abstractFactory.real;

import creational.abstractFactory.real.Car.Car;
import creational.abstractFactory.real.Toys.Toy;

/**
 * Created by jackfrancisdalton on 06/04/17.
 */
public abstract class RegionalFactory {
    abstract Car createCar(int topSpeed);
    abstract Toy createToy(String color);
}
