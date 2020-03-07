package com.black.modelos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Produto {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	
	
	private long idProd;
	private String nome;
	private String descricao;
	private String valor;
	public long getIdProd() {
		return idProd;
	}
	public void setIdProd(long idProd) {
		this.idProd = idProd;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
}
