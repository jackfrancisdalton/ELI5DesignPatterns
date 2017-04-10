package structural.bridge.real;

/**
 * Created by jackfrancisdalton on 06/04/17.
 */
public class GUIDisplay extends Printer {
    public GUIDisplay(OutputShape outputShape) {
        super(outputShape);
    }

    @Override
    public void output(ShapeType type) {
        super.outputShape.printShape(type);
    }
}
