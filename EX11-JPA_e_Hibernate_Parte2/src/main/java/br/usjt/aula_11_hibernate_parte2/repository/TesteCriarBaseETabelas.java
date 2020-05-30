package br.usjt.aula_11_hibernate_parte2.repository;

import javax.persistence.Persistence;

public class TesteCriarBaseETabelas {
	
	public static void main(String[] args) {
		Persistence.createEntityManagerFactory("usjtPU");
	}
}