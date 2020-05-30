package br.usjt.aula_11_hibernate_parte2.repository;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.usjt.aula_11_hibernate_parte2.entity.Cidade;
import br.usjt.aula_11_hibernate_parte2.entity.PrevisoesParaCidade;

public class TesteInsereDuasPrevisoesEmUmaCidade {

		public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Cidade c = new Cidade();
		c.setNome("Biritiba Mirim");
		c.setLatitude("90º");
		c.setLongitude("150º");
		
		
		List <PrevisoesParaCidade> previsoes = new ArrayList <>();
		PrevisoesParaCidade pc1 = new PrevisoesParaCidade();
		pc1.setDataHora("28/05/2020");
		pc1.setTempMin("5ºC");
		pc1.setTempMax("15ºC");
		pc1.setUmidAr("85%");
		pc1.setDescricao("Nublado com possibilidade de chuva");
		pc1.setCidade(c);
		
		
		PrevisoesParaCidade pc2 = new PrevisoesParaCidade ();
		pc2.setDataHora("29/05/2020");
		pc2.setTempMin("2ºC");
		pc2.setTempMax("14ºC");
		pc2.setUmidAr("66%");
		pc2.setDescricao("Céu aberto com possibilidade de geada");
		pc2.setCidade(c);
		
		
		previsoes.add(pc1);
		previsoes.add(pc2);
		c.setPrevisoesparacidade(previsoes);
		manager.persist(c);
		transaction.commit();
		manager.close();
		JPAUtil.close();
		}
}
		

