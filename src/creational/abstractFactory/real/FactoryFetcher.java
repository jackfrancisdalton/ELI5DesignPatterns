package creational.abstractFactory.real;

import android.graphics.Region;

/**
 * Created by jackfrancisdalton on 07/04/17.
 */
public class FactoryFetcher {

    public static RegionalFactory getFactory(CountryCode countryCode) {
        if(countryCode.equals(CountryCode.UK)) {
            return new FactoryUK();
        } else if(countryCode.equals(CountryCode.USA)) {
            return new FactoryUSA();
        } else {
            System.out.print("That country code has no factory");
        }
        return null;
    }
}
