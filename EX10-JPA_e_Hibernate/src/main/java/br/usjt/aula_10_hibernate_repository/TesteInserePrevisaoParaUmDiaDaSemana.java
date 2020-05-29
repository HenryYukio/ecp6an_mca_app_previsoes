package br.usjt.aula_10_hibernate_repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.usjt.aula_10_hibernate.entity.Previsao;
import br.usjt.aula_10_hibernate.entity.Semana;
import br.usjt.aula_10_hibernate_repository.JPAUtil;

public class TesteInserePrevisaoParaUmDiaDaSemana {
	
	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Semana s = new Semana();
		s.setNome("Quinta");
		manager.persist(s);
		Previsao p = new Previsao();
		p.setTempMin("20°C");
		p.setTempMax("32°C");
		p.setUmidAr("40");
		p.setDataHora("2020-06-02T00:00");
		p.setDescricao("Chuvoso");	
		p.setSemana(s);
		manager.persist(p);
		transaction.commit();
		manager.close();
		JPAUtil.close();
	}

}

