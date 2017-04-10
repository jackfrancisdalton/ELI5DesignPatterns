package behavioural.nullobject.concept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by jackfrancisdalton on 08/04/17.
 */
public class ObjectFetcher {
    private static List<AbstractObject> objectList =  new ArrayList<>(
            Arrays.asList(
                    new ImpObject(1),
                    new ImpObject(2),
                    new ImpObject(3),
                    new ImpObject(4),
                    new ImpObject(5),
                    new ImpObject(6)
            )
    );

    public static AbstractObject getObject(int id) {
        for (AbstractObject obj: objectList) {
            if(obj.getId() == id) {
                return obj;
            }
        }
        return new NullObject(0);
    }
}
