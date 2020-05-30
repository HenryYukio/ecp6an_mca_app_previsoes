package br.usjt.aula_11_hibernate_parte2.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.usjt.aula_11_hibernate_parte2.entity.Previsao;
import br.usjt.aula_11_hibernate_parte2.entity.Semana;
import br.usjt.aula_11_hibernate_parte2.repository.JPAUtil;

public class TesteInserePrevisaoParaUmDiaDaSemana {
	
	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Semana s = new Semana();
		s.setNome("Terça");
		manager.persist(s);
		Previsao p = new Previsao();
		p.setTempMin("15°C");
		p.setTempMax("29°C");
		p.setUmidAr("50");
		p.setDataHora("2020-06-02T00:00");
		p.setDescricao("Chuvoso");	
		p.setSemana(s);
		manager.persist(p);
		transaction.commit();
		manager.close();
		JPAUtil.close();
	}

}

