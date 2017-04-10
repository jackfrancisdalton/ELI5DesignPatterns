package creational.abstractFactory.real.Car;

/**
 * Created by jackfrancisdalton on 06/04/17.
 */
public class CarUSA extends Car {
    private int speed;

    public CarUSA(int id, int speed) {
        this.id = id;
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public void drive() {
        System.out.println("Driving UK car at " + getSpeed() + "kmh productId:" + this.getId());
    }
}
