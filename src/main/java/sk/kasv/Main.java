package sk.kasv;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class Main {
  public static void main(String[] args) throws FileNotFoundException, SQLException {

    //RunScripts.runSqlScripts();

    SessionFactory factory = new Configuration().
      configure("hibernate.cfg.xml").
      addAnnotatedClass(Student.class).
      addAnnotatedClass(Instructor.class).
      addAnnotatedClass(InstructorDetail.class).
      buildSessionFactory();

    Session session = factory.getCurrentSession();

    try {
      session.beginTransaction();

      Instructor i1 = new Instructor("Sak", "dobre", "mirijam@gmail.com");
      InstructorDetail id1 = new InstructorDetail("course", "my_channel");
      i1.setDetail(id1);
      session.persist(i1);
      session.getTransaction().commit();

    } finally {
      session.close();
    }
  }
}
