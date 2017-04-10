package structural.bridge.real;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Printer> printers = new ArrayList<>(
                Arrays.asList(
                        new Console(new OutputTextShape()),
                        new Console(new OutputASCIIShape()),
                        new GUIDisplay(new OutputTextShape())
                )
        );

        for(int i = 0; i < printers.size(); i++) {
            printers.get(i).output(ShapeType.square);
            printers.get(i).output(ShapeType.triangle);
            printers.get(i).output(ShapeType.circle);
            System.out.println("--------");
        }
    }
}
