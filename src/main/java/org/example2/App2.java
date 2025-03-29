package org.example2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App2 {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        laptop.setId(98);
        laptop.setName("dell");

        Student student = new Student();
        student.setMarks(34);
        student.setName("bhaskar");
        student.setRollNo(13);
        student.getLaptop().add(laptop);


        Configuration cfg = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class).addAnnotatedClass(Student.class);

        SessionFactory sf = cfg.buildSessionFactory();

        Session session = sf.openSession();
        session.beginTransaction();
        session.save(laptop);
        session.save(student);
        session.getTransaction().commit();


    }
}
