package creational.abstractFactory.real;

import creational.abstractFactory.real.Car.Car;
import creational.abstractFactory.real.Toys.Toy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by jackfrancisdalton on 07/04/17.
 */
public class Main {
    public static void main(String[] args) {
        RegionalFactory factoryUK = FactoryFetcher.getFactory(CountryCode.UK);
        RegionalFactory factoryUSA = FactoryFetcher.getFactory(CountryCode.USA);

        List<Car> cars = new ArrayList<>(Arrays.asList(
           factoryUSA.createCar(120),
           factoryUK.createCar(100),
           factoryUSA.createCar(130),
           factoryUK.createCar(90),
           factoryUK.createCar(50)
        ));
        cars.forEach(Car::drive);

        System.out.println("\n ------------------- \n");

        List<Toy> toys = new ArrayList<>(Arrays.asList(
                factoryUSA.createToy("Red"),
                factoryUK.createToy("Green"),
                factoryUSA.createToy("Blue"),
                factoryUK.createToy("Yellow"),
                factoryUK.createToy("Blue")
        ));

        toys.forEach(Toy::doAction);

    }
}
