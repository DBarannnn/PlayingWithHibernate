package org.example;


import org.example.demo.entity.Person;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
        EntityManager em = emf.createEntityManager();

        try{
            em.getTransaction().begin();
            Person person = em.find(Person.class, 1L);

            System.out.println(person.getFirstName());
            em.getTransaction().commit();
        }
        catch (Exception ex){
            System.out.println("something went wrong");
            ex.printStackTrace();
        }
        finally {
            em.close();
        }
    }

}