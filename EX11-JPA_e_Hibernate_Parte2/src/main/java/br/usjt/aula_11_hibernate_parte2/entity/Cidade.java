package br.usjt.aula_11_hibernate_parte2.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name = "table_cidade")
public class Cidade {

	@Id
	@GeneratedValue
	
	private Long id;
	private String nome;
	private String latitude;
	private String longitude;
	
	@OneToMany (mappedBy = "cidade", cascade = CascadeType.ALL)
	private List <PrevisoesParaCidade> previsoesparacidade;
	
	
	public List<PrevisoesParaCidade> getPrevisoesparacidade() {
		return previsoesparacidade;
	}
	public void setPrevisoesparacidade(List<PrevisoesParaCidade> previsoesparacidade) {
		this.previsoesparacidade = previsoesparacidade;
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
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	
}
	
	