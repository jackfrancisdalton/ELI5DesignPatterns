package structural.bridge.real;


/**
 * Created by jackfrancisdalton on 06/04/17.
 */
public class OutputTextShape implements OutputShape {
    @Override
    public void printShape(ShapeType type) {
        if(type.equals(ShapeType.square)) {
            System.out.println("Square Shape");
        } else if(type.equals(ShapeType.triangle)) {
            System.out.println("Triangle Shape");
        } else if(type.equals(ShapeType.circle)) {
            System.out.println("Circle Shape");
        } else {
                System.out.println("Unsupported Shape Type");
        }
    }
}
