package br.usjt.aula_11_hibernate_parte2.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name = "table_semana")

public class Semana {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private Long id;
	private String nome;
	
	
	
	public Previsao getPrevisao() {
		return previsao;
	}
	public void setPrevisao(Previsao previsao) {
		this.previsao = previsao;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	@OneToOne (mappedBy = "semana")
	private Previsao previsao;
	
	@Override
	public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((id == null) ? 0 : id.hashCode());
	return result;
	}
	
	@Override
	public boolean equals(Object obj) {
	if (this == obj)
	return true;
	if (obj == null)
	return false;
	if (getClass() != obj.getClass())
	return false;
	Semana other = (Semana) obj;
	if (id == null) {
	if (other.id != null)
	return false;
	} else if (!id.equals(other.id))
	return false;
	return true;
	}
	
	
	@Override
	public String toString() {
		return "Semana [id=" + id + ", nome=" + nome + ", previsao=" + previsao + "]";
	}
	
	

	
	
	
	
}
	

