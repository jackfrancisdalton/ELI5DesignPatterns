package creational.factory.concept;


public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory();
        ObjInterface obj1 = factory.getObject(ObjA.class);
        ObjA obj2 = (ObjA) factory.getObject(ObjA.class);
        ObjB obj3 = (ObjB) factory.getObject(ObjB.class);

        //Print out to show that the factory id assign state is changing
        System.out.println(
                "obj1 id:" + obj1.getId()
                + ", obj2 id:" + obj2.getId()
                + ", obj3 id:" + obj3.getId()
        );

        //Print out to show that casting objects from interface object works
        System.out.println(obj2.getName());
        System.out.println(obj3.isEnabled());
    }
}
