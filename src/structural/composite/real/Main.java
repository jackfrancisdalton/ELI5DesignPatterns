package structural.composite.real;

public class Main {

    public static void main(String[] args) {
        Employee e1 = new Employee("Jeff");

        Employee e2 = new Employee("Jane");
        Employee e3 = new Employee("Tim");

        Employee e4 = new Employee("Jeff");
        Employee e5 = new Employee("Sarah");
        Employee e6 = new Employee("Bob");
        Employee e7 = new Employee("Ford");

        //first level
        e1.add(e2);
        e1.add(e3);

        //second level
        e2.add(e4);
        e2.add(e5);
        e3.add(e6);
        e3.add(e7);

        System.out.println(e1.toString() + "\n ---------------- subordinates\n");
        for (Employee e: e1.getSubordinates()) {
            System.out.println(e.toString() + "\n------------- subordinates");

            for (Employee sub : e.getSubordinates()) {
                System.out.println(sub.toString());
            }
            System.out.println("------------- \n");
        }
    }
}
