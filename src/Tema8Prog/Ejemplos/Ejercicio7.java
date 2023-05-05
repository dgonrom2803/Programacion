package Tema8Prog.Ejemplos;

import Tema8Prog.POJOS.EventoMusical;
import jdk.jfr.Event;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Ejercicio7 {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("objectdb:$objetcdb/db/coches.odb");
        EntityManager em = emf.createEntityManager();

        //Iniciar la transacción
        em.getTransaction().begin();
        EventoMusical evento1 = em.find(EventoMusical.class, 1);
        if (evento1 == null){
            System.out.println("Evento no encontrado");
        } else{
            em.remove(evento1);
        }

        em.getTransaction().commit();
    }
}
