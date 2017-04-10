package creational.factory.concept;

public class ObjA implements ObjInterface {
    private int id;
    private String name;

    public ObjA(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getObjectDetails() {
        return "id: " + getId() + ", name:" + getName();
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
}
