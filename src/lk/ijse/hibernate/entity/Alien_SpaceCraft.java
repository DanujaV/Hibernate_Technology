package lk.ijse.hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Alien_SpaceCraft {
    @Id
    private String id;
    private String model;

    public Alien_SpaceCraft(String id, String model) {
        this.id = id;
        this.model = model;
    }

    public Alien_SpaceCraft() {
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
