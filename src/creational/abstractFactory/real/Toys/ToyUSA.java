package creational.abstractFactory.real.Toys;

/**
 * Created by jackfrancisdalton on 07/04/17.
 */
public class ToyUSA extends Toy {
    private String color;

    public ToyUSA(int id, String color) {
        this.id = id;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void doAction() {
        System.out.println("The " + getColor() + " UK toy does an action. productId:" + getId());
    }
}
