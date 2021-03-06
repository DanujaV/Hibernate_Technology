package lk.ijse.hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Alien {
    @Id
    private String id;
    private String name;
    private String colour;

    @OneToOne
    private SpaceCraft spaceCraft;

    public Alien() {
    }

    public Alien(String id, String name, String colour, SpaceCraft spaceCraft) {
        this.id = id;
        this.name = name;
        this.colour = colour;
        this.spaceCraft = spaceCraft;
    }

    public SpaceCraft getSpaceCraft() {
        return spaceCraft;
    }

    public void setSpaceCraft(SpaceCraft spaceCraft) {
        this.spaceCraft = spaceCraft;
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
                ", spaceCraft=" + spaceCraft +
                '}';
    }
}
