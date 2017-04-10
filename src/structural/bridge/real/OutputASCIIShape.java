package structural.bridge.real;

public class OutputASCIIShape implements OutputShape {
    @Override
    public void printShape(ShapeType type) {
        if(type.equals(ShapeType.square)) {
            System.out.println("|‾‾|");
            System.out.println("|__|");
        } else if(type.equals(ShapeType.triangle)) {
            System.out.println(" /\\");
            System.out.println("/  \\");
            System.out.println("‾‾‾‾");
        } else {
            System.out.println("Unsupported Shape Type");
        }
    }
}
