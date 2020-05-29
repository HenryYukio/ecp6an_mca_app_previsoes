package br.usjt.aula_10_hibernate_repository;

import javax.persistence.EntityManager;
import br.usjt.aula_10_hibernate.entity.Previsao;

public class TesteBuscaPrevisaoDaSemana {
	
	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		Previsao p = manager.find(Previsao.class, 1L);
		System.out.println(p);
		manager.close();
		JPAUtil.close();
		}
		

}
