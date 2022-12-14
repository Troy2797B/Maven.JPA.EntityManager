package services;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManager {
   EntityManagerFactory emf = Persistence.createEntityManagerFactory("");
}
