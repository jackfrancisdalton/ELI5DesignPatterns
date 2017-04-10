package creational.abstractFactory.real;

import creational.abstractFactory.real.Car.Car;
import creational.abstractFactory.real.Car.CarUSA;
import creational.abstractFactory.real.Toys.Toy;
import creational.abstractFactory.real.Toys.ToyUSA;

public class FactoryUSA extends RegionalFactory{
    private static int id = 1;
    public FactoryUSA() {}

    @Override
    Car createCar(int topSpeed) {
        CarUSA car = new CarUSA(id, topSpeed);
        id++;
        return car;
    }

    @Override
    Toy createToy(String color) {
        ToyUSA toy = new ToyUSA(id, color);
        id++;
        return toy;
    }
}
