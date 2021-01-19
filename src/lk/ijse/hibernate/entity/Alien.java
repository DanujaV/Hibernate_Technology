package lk.ijse.hibernate.entity;

public class Alien {
    private String id;
    private String name;
    private String colour;

    public Alien() {
    }

    public Alien(String id, String name, String colour) {
        this.id = id;
        this.name = name;
        this.colour = colour;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }
}
