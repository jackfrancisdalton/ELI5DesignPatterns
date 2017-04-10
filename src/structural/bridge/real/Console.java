package structural.bridge.real;

/**
 * Created by jackfrancisdalton on 06/04/17.
 */
public class Console extends Printer {

    public Console(OutputShape outputShape) {
        super(outputShape);
    }

    @Override
    public void output(ShapeType type) {
        outputShape.printShape(type);
    }
}
