package structural.bridge.concept;

import java.lang.*;


public class Main {
    public static void main(String[] args) {
        Object objA = new Object(new FunctionalityA());
        Object objB = new Object(new FunctionalityB());

        objA.display();
        objB.display();
    }
}
