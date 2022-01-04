package mx.com.sintelti.main;

import java.util.Date;
import java.util.List;

import javax.swing.JOptionPane;

import mx.com.sintelti.domain.EventoEntity;
import mx.com.sintelti.util.HibernateUtil;

import org.hibernate.Criteria;
import org.hibernate.classic.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ManejadorDeEventos {
    static Logger log = LoggerFactory.getLogger(ManejadorDeEventos.class);

    public static void main(String[] args) {
        ManejadorDeEventos mde = new ManejadorDeEventos();
        char opcion = '1';
        do {
            switch (opcion) {

                case '1':
                    String titulo = JOptionPane.showInputDialog("Ingrese T�tulo de Evento");
                    mde.crearEvento(titulo, new Date());
                    break;
                case '2':
                    mde.editarEvento((long) 1, "titulo");
                    break;
                case '3':
                    break;
                case '4':
                    mde.listarEventos();
                    break;
            }
        } while ((opcion = JOptionPane.showInputDialog("¿Ingresar nuevo evento? 1,2,3,4").charAt(0)) != 'n');
    }

    void crearEvento(String titulo, Date fecha) {
        Session session =
                HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        System.out.println("Creando evento");
        log.info("-- Creando Evento --");
        EventoEntity evento = new EventoEntity();
        evento.setTitulo(titulo);
        evento.setFecha(fecha);
        session.save(evento);
        session.getTransaction().commit();
    }

    void editarEvento(Long id, String titulo) {
        log.info("-- Creando Evento --");

    }

    void eliminarEvento(Long id) {
        log.info("-- Eliminando Evento --");
    }

    void listarEventos() {
        Session session =
                HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        log.info("-- Listado de Eventos --");
        Criteria criteria = session.createCriteria(EventoEntity.class);
        @SuppressWarnings("unchecked")
        List<EventoEntity> eventos = criteria.list();

        for (EventoEntity evento : eventos) {
            System.out.println(evento);
        }
    }

}
