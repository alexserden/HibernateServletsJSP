package repository.Hibernate;


import model.Developer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import repository.DeveloperRepository;
import repository.util.HibernateUtil;

import java.util.List;

public class DeveloperRepositoryImpl implements DeveloperRepository {

    private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    public void create(Developer developer) {
        Session session = null;
        try {
            session = sessionFactory.openSession();
            session.beginTransaction();
            session.save(developer);
            session.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("error at create");
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
    }

    public Developer getById(Long aLoidng) {
        return null;
    }

    public void update(Developer developer) {

    }

    public void delete(Long idDeveloper) {
        Session session = null;
        try {
            session = sessionFactory.openSession();
            session.beginTransaction();
            Developer developer = session.load(Developer.class,new Long(idDeveloper));
            session.delete(developer);
            session.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("error at create");
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }

        }
    }

    public List<Developer> getAll() {
        List list;
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        list = session.createQuery("FROM Developer").list();

        session.getTransaction().commit();
        session.close();
        return list;
    }

}