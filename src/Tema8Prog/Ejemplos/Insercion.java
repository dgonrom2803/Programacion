package Tema8Prog.Ejemplos;

import Tema8Prog.POJOS.Coche;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class Insercion {
    public static void main(String[] args) {

        //Abrir conexión
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("objectdb:$objetcdb/db/coches.odb");
        EntityManager em = emf.createEntityManager();

        // Iniciar la transacción
        em.getTransaction().begin();

        // Operaciones
        Coche c1 = new Coche();
        c1.setColor("Rojo");

        Coche c2 = new Coche();
        c2.setColor("Verde");
        em.persist(c1);
        em.persist(c2);


        //Finalizar la transacción: salvar la información
        em.getTransaction().commit();

        // Cerrar conexión
        em.close();
        emf.close();

        //Recuperación (Read) usando JPQL
        TypedQuery<Coche> query2 = em.createQuery("SELECT c FROM cochecito WHERE color LIKE ?1", Coche.class);
        query2.setParameter(1, "Rojo");
        Coche coche2 = query2.getSingleResult();
        System.out.println(coche2);
    }

}
