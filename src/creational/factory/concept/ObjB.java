package creational.factory.concept;

public class ObjB implements ObjInterface{
    private int id;
    private String name;
    private boolean enabled;

    public ObjB(int id, String name, boolean enabled) {
        this.id = id;
        this.name = name;
        this.enabled = enabled;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getObjectDetails() {
        return "id: " + getId() + ", name:" + getName() + ", enabled:" + isEnabled();
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}
