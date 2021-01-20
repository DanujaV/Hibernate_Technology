package lk.ijse.hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class SpaceCraftOneToMany {
    @Id
    private String id;
    private String model;

    @ManyToOne
    private AlienOneToMany alienOneToMany;


    public SpaceCraftOneToMany() {
    }


    public AlienOneToMany getAlienOneToMany() {
        return alienOneToMany;
    }

    public void setAlienOneToMany(AlienOneToMany alienOneToMany) {
        this.alienOneToMany = alienOneToMany;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Alien_SpaceCraft{" +
                "id='" + id + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
