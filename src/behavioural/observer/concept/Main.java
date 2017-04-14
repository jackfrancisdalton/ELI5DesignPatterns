package behavioural.observer.concept;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Subject sub = new Subject();
        new Observer(sub);
        new Observer(sub);
        new Observer(sub);

        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("\nEnter a number: ");
            sub.setState(scan.nextInt());
        }
    }
}
