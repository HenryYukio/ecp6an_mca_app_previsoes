package br.usjt.aula_11_hibernate_parte2.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import br.usjt.aula_11_hibernate_parte2.entity.Semana;

@Entity
@Table(name="tb_previsao")

	public class Previsao {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
		private Long id;
@Column(nullable=false, length=30)
		private String tempMin;
@Column(nullable=false, length=30)
		private String tempMax;
@Column(nullable=false, length=30)
		private String umidAr;
@Column(nullable=false, length=30)
		private String dataHora;
@Column(nullable=false, length=30)
		private String descricao;

@OneToOne(optional=false)
@JoinColumn(name="id_da_semana")
private Semana semana;

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getTempMin() {
	return tempMin;
}

public void setTempMin(String tempMin) {
	this.tempMin = tempMin;
}

public String getTempMax() {
	return tempMax;
}

public void setTempMax(String tempMax) {
	this.tempMax = tempMax;
}

public String getUmidAr() {
	return umidAr;
}

public void setUmidAr(String umidAr) {
	this.umidAr = umidAr;
}

public String getDataHora() {
	return dataHora;
}

public void setDataHora(String dataHora) {
	this.dataHora = dataHora;
}

public String getDescricao() {
	return descricao;
}

public void setDescricao(String descricao) {
	this.descricao = descricao;
}

public Semana getSemana() {
	return semana;
}

public void setSemana(Semana semana) {
	this.semana = semana;
}

@Override
public String toString() {
	return "Previsao [id=" + id + ", tempMin=" + tempMin + ", tempMax=" + tempMax + ", umidAr=" + umidAr + ", dataHora="
			+ dataHora + ", descricao=" + descricao + ", semana=" + semana + "]";
}


}