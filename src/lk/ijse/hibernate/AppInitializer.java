package lk.ijse.hibernate;

import lk.ijse.hibernate.entity.*;
import lk.ijse.hibernate.util.FactoryConfiguration;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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

        /*AlienManyToMany jadhu = new AlienManyToMany();
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
        session.save(secondCraft);*/


        // HQL
        /*
        SpaceCraft firstCraft = new SpaceCraft();
        firstCraft.setId("CR001");
        firstCraft.setModel("circle");

        SpaceCraft secondCraft = new SpaceCraft();
        secondCraft.setId("CR002");
        secondCraft.setModel("Triangle");

        Alien firstAlien = new Alien();
        firstAlien.setId("A001");
        firstAlien.setName("Jadhu");
        firstAlien.setColour("Green");
        firstAlien.setSpaceCraft(firstCraft);

        Alien secondAlien = new Alien();
        secondAlien.setId("A002");
        secondAlien.setName("Kabhir");
        secondAlien.setColour("Blue");
        secondAlien.setSpaceCraft(secondCraft);

        session.save(firstAlien);
        session.save(secondAlien);
        session.save(firstCraft);
        session.save(secondCraft);*/

        /*Query alien = session.createQuery("from Alien ");
        List <Alien> list = alien.list();

        for (Alien alien1 : list) {
            System.out.println(alien1);
        }*/

        //get result from the table( sql:- select * from Alien )
        /*Query query = session.createQuery("from Alien");
        List <Alien> list = query.list();

        for (Alien alien : list) {
            System.out.println(alien);
        }*/

        //get specific result set from the table. (specific row)
        /*Query query = session.createQuery("from Alien where id = ?1");
        query.setParameter(1, "A002");

        Object o = query.uniqueResult();
        System.out.println(o);*/

        //get value from table only specific column
        /*
        Query query = session.createQuery("select name, colour from Alien where id = ?1");
        query.setParameter(1,"A001");

        Object[] o = (Object[]) query.uniqueResult();
        System.out.println(o[0] + " - " + o[1]);
*/


        //Native code (if someone need to use Sql instead HQL, then use this method)
        /*NativeQuery query = session.createSQLQuery("select  * from Alien");
        query.addEntity(Alien.class);

        List<Alien> list = query.list();

        for (Alien alien : list) {
            System.out.println(alien);
        }*/

        /*NativeQuery query = session.createSQLQuery("select name,colour from Alien");
        query.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);

        List <Object> list = query.list();
        for (Object alien : list) {
            Map map = (Map) alien;
            System.out.println(map.get("name") + " - " + map.get("colour"));
        }*/


        session.close();


    }
}
