package lk.ijse.hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.List;

@Entity
public class SpaceCraftManyToMany {
    @Id
    private String id;
    private String model;

    @ManyToMany(mappedBy = "spaceCraftManyToMany")
    private List<AlienManyToMany> alienManyToManyList;

    public SpaceCraftManyToMany() {
    }

    public SpaceCraftManyToMany(String id, String model, List<AlienManyToMany> alienManyToManyList) {
        this.id = id;
        this.model = model;
        this.alienManyToManyList = alienManyToManyList;
    }

    public List<AlienManyToMany> getAlienManyToManyList() {
        return alienManyToManyList;
    }

    public void setAlienManyToManyList(List<AlienManyToMany> alienManyToManyList) {
        this.alienManyToManyList = alienManyToManyList;
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
        return "SpaceCraftManyToMany{" +
                "id='" + id + '\'' +
                ", model='" + model + '\'' +
                ", alienManyToManyList=" + alienManyToManyList +
                '}';
    }
}
