package br.usjt.aula_11_hibernate_parte2.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	
	private static EntityManagerFactory factory;
	static {
		factory = Persistence.createEntityManagerFactory("usjtPU");
	}
	public static EntityManager getEntityManager () {
		return factory.createEntityManager();
	}
	public static void close () {
		factory.close();
	}
}