package behavioural.nullobject.concept;

/**
 * Created by jackfrancisdalton on 08/04/17.
 */
public class Main {
    public static void main(String[] args) {
        ObjectFetcher.getObject(4).execute();
        ObjectFetcher.getObject(5).execute();
        ObjectFetcher.getObject(6).execute();
        ObjectFetcher.getObject(7).execute();
    }
}
