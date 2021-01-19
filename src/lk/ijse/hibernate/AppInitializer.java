package lk.ijse.hibernate;

import lk.ijse.hibernate.entity.Alien;

public class AppInitializer {
    public static void main(String[] args) {
        Alien alien = new Alien();
        alien.setId("A001");
        alien.setName("Kamal");
        alien.setColour("Green");

        save(alien);
    }
}
