package br.usjt.aula_11_hibernate_parte2.repository;

import javax.persistence.EntityManager;

import br.usjt.aula_11_hibernate_parte2.entity.Semana;

public class TesteBuscaDiaDaSemanaComPrevisaoAssociada {
	
		public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		Semana s = manager.find(Semana.class, 1L);
		System.out.println(s.getPrevisao().getTempMin());
		System.out.println(s.getPrevisao().getTempMax());
		System.out.println(s.getPrevisao().getUmidAr());
		manager.close();
		JPAUtil.close();
		}
		

}
