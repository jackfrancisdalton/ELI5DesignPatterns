package structural.proxy.concept;


public class Object {
    private String immutableProperty;
    private String mutableProperty;

    public Object(String immutableProperty, String mutableProperty) {
        this.immutableProperty = immutableProperty;
        this.mutableProperty = mutableProperty;
    }

    public String getImmutableProperty() {
        return immutableProperty;
    }

    public void setImmutableProperty(String immutableProperty) {
        this.immutableProperty = immutableProperty;
    }

    public String getMutableProperty() {
        return mutableProperty;
    }

    public void setMutableProperty(String mutableProperty) {
        this.mutableProperty = mutableProperty;
    }
}
