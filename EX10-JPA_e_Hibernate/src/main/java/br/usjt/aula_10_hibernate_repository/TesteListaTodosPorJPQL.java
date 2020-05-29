package br.usjt.aula_10_hibernate_repository;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.EntityManager;

import br.usjt.aula_10_hibernate.entity.Previsao;

public class TesteListaTodosPorJPQL {
	
		public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		Query query = manager.createQuery("from Previsao");
		List <Previsao> previsoes = query.getResultList();
		for (Previsao p : previsoes) {
		System.out.println(p);
		}
		manager.close();
		JPAUtil.close();
		}
}


