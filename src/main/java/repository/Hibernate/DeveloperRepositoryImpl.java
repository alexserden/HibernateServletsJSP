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

    }

    public Developer getById(Long aLong) {
        return null;
    }

    public void update(Developer developer) {

    }

    public void delete(Long aLong) {

    }

    public List<Developer> getAll() {
        List<Developer> list;
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        list = (List<Developer>) session.createQuery("FROM Developer").list();
        session.getTransaction().commit();
        session.close();
        return list;
    }

}