package br.usjt.aula_11_hibernate_parte2.repository;

import javax.persistence.EntityManager;

import br.usjt.aula_11_hibernate_parte2.entity.Cidade;

public class TesteBuscaUmParaN {
	
		public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		Cidade c = manager.find(Cidade.class, 6L);
		System.out.println(c.getPrevisoesparacidade());
		manager.close();
		JPAUtil.close();
		}


}
