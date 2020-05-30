package br.usjt.aula_11_hibernate_parte2.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.usjt.aula_11_hibernate_parte2.entity.Previsao;

public class TesteRemovePrevisao {
	
	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Previsao p = manager.find(Previsao.class, 1L);
		manager.remove(p);
		transaction.commit();
		manager.close();
		JPAUtil.close();
	}
	

}
