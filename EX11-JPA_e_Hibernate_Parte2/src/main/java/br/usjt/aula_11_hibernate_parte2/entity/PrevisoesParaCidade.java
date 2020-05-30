package br.usjt.aula_11_hibernate_parte2.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
	@Table(name="table_previsoes_da_cidade")

		public class PrevisoesParaCidade {
	@Id
	@GeneratedValue
			private Long id;
			private String tempMin;
			private String tempMax;
			private String umidAr;
			private String dataHora;
			private String descricao;
	
	@ManyToOne
	private Cidade cidade;

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

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	@Override
	public String toString() {
		return "PrevisoesParaCidade [id=" + id + ", tempMin=" + tempMin + ", tempMax=" + tempMax + ", umidAr=" + umidAr
				+ ", dataHora=" + dataHora + ", descricao=" + descricao + "]";
	}


	

}
