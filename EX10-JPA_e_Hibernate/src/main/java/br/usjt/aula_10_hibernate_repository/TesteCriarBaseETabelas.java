package br.usjt.aula_10_hibernate_repository;

import javax.persistence.Persistence;

public class TesteCriarBaseETabelas {
	
	public static void main(String[] args) {
		Persistence.createEntityManagerFactory("usjtPU");
	}
}