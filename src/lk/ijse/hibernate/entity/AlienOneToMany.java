package lk.ijse.hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.ArrayList;
import java.util.List;

@Entity
public class AlienOneToMany {
    @Id
    private String id;
    private String name;
    private String colour;

    @OneToMany(mappedBy = "alienOneToMany")
    List<SpaceCraftOneToMany> spaceCraftOneToMany = new ArrayList<>();

    public AlienOneToMany() {
    }

    public AlienOneToMany(String id, String name, String colour, List<SpaceCraftOneToMany> spaceCraftOneToMany) {
        this.id = id;
        this.name = name;
        this.colour = colour;
        this.spaceCraftOneToMany = spaceCraftOneToMany;
    }

    public List<SpaceCraftOneToMany> getSpaceCraftOneToMany() {
        return spaceCraftOneToMany;
    }

    public void setSpaceCraftOneToMany(List<SpaceCraftOneToMany> spaceCraftOneToMany) {
        this.spaceCraftOneToMany = spaceCraftOneToMany;
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
        return "AlienOnToMany{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                ", spaceCraftOneToMany=" + spaceCraftOneToMany +
                '}';
    }
}
