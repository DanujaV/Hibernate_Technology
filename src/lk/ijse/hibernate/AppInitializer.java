package lk.ijse.hibernate;

import lk.ijse.hibernate.entity.Alien;
import lk.ijse.hibernate.entity.Alien_SpaceCraft;
import lk.ijse.hibernate.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

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

        // OneToMany
        Alien_SpaceCraft alien_spaceCraft = new Alien_SpaceCraft();
        alien_spaceCraft.setId("AS001");
        alien_spaceCraft.setModel("circle");

        Alien alien = new Alien();
        alien.setId("A001");
        alien.setName("Jadhu");
        alien.setColour("Green");
        alien.setAlien_spaceCraft(alien_spaceCraft);

        session.save(alien);
        session.save(alien_spaceCraft);


        transaction.commit();

        session.close();
    }
}
