package br.usjt.Aula_12_Rest_Json.model.beans;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

	public class Cidade implements Serializable{
	private static final long serialVersionUID = 1L;

@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)


	private long id;
	private String nome;
	private String letraInicial;
	private String latitude;
	private String longitude;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getLetraInicial() {
		return letraInicial;
	}
	public void setLetraInicial(String letraInicial) {
		this.letraInicial = letraInicial;
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	@Override
	public String toString() {
		return "Cidade [id=" + id + ", nome=" + nome + ", letraInicial=" + letraInicial + ", latitude=" + latitude
				+ ", longitude=" + longitude + "]";
	}
	
	

}
