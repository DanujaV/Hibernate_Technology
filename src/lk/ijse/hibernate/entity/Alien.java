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
    private Alien_SpaceCraft alien_spaceCraft;

    public Alien() {
    }

    public Alien(String id, String name, String colour, Alien_SpaceCraft alien_spaceCraft) {
        this.id = id;
        this.name = name;
        this.colour = colour;
        this.alien_spaceCraft = alien_spaceCraft;
    }

    public Alien_SpaceCraft getAlien_spaceCraft() {
        return alien_spaceCraft;
    }

    public void setAlien_spaceCraft(Alien_SpaceCraft alien_spaceCraft) {
        this.alien_spaceCraft = alien_spaceCraft;
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
                ", alien_spaceCraft=" + alien_spaceCraft +
                '}';
    }
}
