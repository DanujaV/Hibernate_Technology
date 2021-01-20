package lk.ijse.hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class AlienManyToMany {
    @Id
    private String id;
    private String name;
    private String colour;

    @ManyToMany
    private List<SpaceCraftManyToMany> spaceCraftManyToMany;

    public AlienManyToMany() {
    }

    public AlienManyToMany(String id, String name, String colour, List<SpaceCraftManyToMany> spaceCraftManyToMany) {
        this.id = id;
        this.name = name;
        this.colour = colour;
        this.spaceCraftManyToMany = spaceCraftManyToMany;
    }

    public List<SpaceCraftManyToMany> getSpaceCraftManyToMany() {
        return spaceCraftManyToMany;
    }

    public void setSpaceCraftManyToMany(List<SpaceCraftManyToMany> spaceCraftManyToMany) {
        this.spaceCraftManyToMany = spaceCraftManyToMany;
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
        return "AlienManyToMany{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                ", spaceCraftManyToMany=" + spaceCraftManyToMany +
                '}';
    }
}
