package br.usjt.aula_10_hibernate_repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.usjt.aula_10_hibernate.entity.Semana;

public class TesteRemoveDiaDaSemanaComPrevisaoAssociada {
	
	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Semana s = manager.find(Semana.class, 1L);
		manager.remove(s);
		manager.close();
		JPAUtil.close();
		}
}


