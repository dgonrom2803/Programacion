package Tema8Prog.Ejemplos;

import Tema8Prog.POJOS.EventoMusical;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Ejercicio6 {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("objectdb:$objetcdb/db/coches.odb");
        EntityManager em = emf.createEntityManager();

        //Iniciar la transacción
        em.getTransaction().begin();

        EventoMusical evento = em.find(EventoMusical.class, 1);
        if (evento == null){
            System.out.println("Evento no encontrado");
        } else {
            evento.setNombre("Primavera Trompetera");
        }
        //Finalizar la transacción: salvar la información
        em.getTransaction().commit();
    }
}
