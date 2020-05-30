package br.usjt.aula_11_hibernate_parte2.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.usjt.aula_11_hibernate_parte2.entity.Previsao;

public class TesteInsereUmaPrevisao {

	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Previsao p = new Previsao ();
		p.setTempMin("18°C");
		p.setTempMax("25°C");
		p.setUmidAr("89%");
		p.setDataHora("2020-05-26T04:00");
		p.setDescricao("Nublado");
		manager.persist(p);
		transaction.commit();
		manager.close();
		JPAUtil.close();
		}
}