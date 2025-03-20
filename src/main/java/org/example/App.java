package org.example;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class App 
{
    public static void main( String[] args )
    {
        Alien alien = new Alien();
        AlienName alienName = new AlienName();
        alienName.setFname("Bhaskar");
        alienName.setLname("Singh");
        alienName.setMname("Kumar");
        alien.setAid(5);
        alien.setColor("red");
        alien.setName(alienName);
        Configuration cfg = new Configuration().configure();
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
//        alien= (Alien) session.get(Alien.class, 100);

        session.save(alien);
        tx.commit();
        System.out.println(alien);
        session.close();





    }
}
