package creational.factory.concept;


public class Factory {
    private static int idToAssign = 1;

    public ObjInterface getObject(Class<? extends ObjInterface> classType) {
        ObjInterface returnObj;

        if(classType.equals(ObjA.class))
            returnObj = new ObjA(idToAssign, "Object A");
        else if(classType.equals(ObjB.class))
            returnObj = new ObjB(idToAssign, "Object B", true);
        else
            returnObj = null;

        idToAssign++;
        return returnObj;
    }
}
