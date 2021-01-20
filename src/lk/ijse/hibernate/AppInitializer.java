package lk.ijse.hibernate;

import lk.ijse.hibernate.entity.*;
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

        //ManyToMany

        AlienManyToMany jadhu = new AlienManyToMany();
        jadhu.setId("A001");
        jadhu.setName("Jadhu");
        jadhu.setColour("Green");

        AlienManyToMany kabhir = new AlienManyToMany();
        kabhir.setId("A002");
        kabhir.setName("Kabhir");
        kabhir.setColour("Blue");

        SpaceCraftManyToMany craft = new SpaceCraftManyToMany();
        craft.setId("CR001");
        craft.setModel("Circle");

        SpaceCraftManyToMany secondCraft = new SpaceCraftManyToMany();
        secondCraft.setId("CR002");
        secondCraft.setModel("Triangle");

        List<AlienManyToMany> alienList = new ArrayList<>();
        alienList.add(jadhu);
        alienList.add(kabhir);

        List<SpaceCraftManyToMany> craftList = new ArrayList<>();
        craftList.add(craft);
        craftList.add(secondCraft);

        jadhu.setSpaceCraftManyToMany(craftList);
        kabhir.setSpaceCraftManyToMany(craftList);

        craft.setAlienManyToManyList(alienList);
        secondCraft.setAlienManyToManyList(alienList);

        session.save(jadhu);
        session.save(kabhir);
        session.save(craft);
        session.save(secondCraft);

        transaction.commit();

        session.close();
    }
}
