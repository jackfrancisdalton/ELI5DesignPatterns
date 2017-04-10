package structural.bridge.real;

public abstract class Printer {
    protected OutputShape outputShape;

    protected Printer(OutputShape outputShape) {
        this.outputShape = outputShape;
    }

    public abstract void output(ShapeType type);
}
