package lk.ijse.hibernate;

import lk.ijse.hibernate.entity.Alien;
import lk.ijse.hibernate.entity.AlienOneToMany;
import lk.ijse.hibernate.entity.SpaceCraft;
import lk.ijse.hibernate.entity.SpaceCraftOneToMany;
import lk.ijse.hibernate.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class AppInitializer {
    public static void main(String[] args) {

       /* Alien alien = new Alien();
        alien.setId("A001");
        alien.setName("Sumana");
        alien.setColour("Pink");*/

        Session session = FactoryConfiguration.getInstance().getSession();

        Transaction transaction = session.beginTransaction();

        /*session.save(alien);*/

        // EAGER Fetching
        /*Alien alien = session.get(Alien.class, "A001");
        alien.setName("Sripala");*/


        // Lazy Fetching
      /*  Alien alien = session.load(Alien.class, "A001");
        System.out.println(alien.getName());
*/

        // OneToOne
        /*SpaceCraft spaceCraft = new SpaceCraft();
        spaceCraft.setId("AS001");
        spaceCraft.setModel("circle");

        Alien alien = new Alien();
        alien.setId("A001");
        alien.setName("Jadhu");
        alien.setColour("Green");
        alien.setSpaceCraft(spaceCraft);

        session.save(alien);
        session.save(spaceCraft);
*/

        //OneToMany
/*
        AlienOneToMany firstAlien = new AlienOneToMany();
        firstAlien.setId("A001");
        firstAlien.setName("Jadhu");
        firstAlien.setColour("Green");


        SpaceCraftOneToMany firstCraft = new SpaceCraftOneToMany();
        firstCraft.setId("CR001");
        firstCraft.setModel("circle");

        SpaceCraftOneToMany secondCraft = new SpaceCraftOneToMany();
        secondCraft.setId("CR002");
        secondCraft.setModel("Triangle");

        List<SpaceCraftOneToMany> craftList = new ArrayList<>();
        craftList.add(firstCraft);
        craftList.add(secondCraft);

        firstAlien.setSpaceCraftOneToMany(craftList);

        firstCraft.setAlienOneToMany(firstAlien);
        secondCraft.setAlienOneToMany(firstAlien);

        session.save(firstCraft);
        session.save(secondCraft);
        session.save(firstAlien);*/

        transaction.commit();

        session.close();
    }
}
