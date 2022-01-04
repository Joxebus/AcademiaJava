package mx.com.everis.service;

/**
 * @author: Jorge Omar Bautista Valenzuela
 * Date: 31/05/2012
 * Time: 13:00 hrs
 * e-mail: joxebus@gmail.com
 */

import java.util.List;


import mx.com.sintelti.domain.PersistibleInterface;
import mx.com.sintelti.util.HibernateUtil;

import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

public class OperacionesCRUD<T extends PersistibleInterface> {

    private Session session;

    public void create(T obj) {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.save(obj);
        session.getTransaction().commit();
    }

    @SuppressWarnings("unchecked")
    public T read(T obj) {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        T objRead = (T) session.createCriteria(obj.getClass())
                .add(Restrictions.idEq(obj.getId())).uniqueResult();
        return objRead;
    }

    public void update(T obj) {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.update(obj);
        session.getTransaction().commit();
    }

    public void delete(Object obj) {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.delete(obj);
        session.getTransaction().commit();
    }

    @SuppressWarnings("unchecked")
    public List<T> list(T obj) {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        return session.createCriteria(obj.getClass()).list();
    }

}
