package com.example.carros.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Carro {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
    @Column(name = "nome")
	private String nome;
	@Column(name = "descricao")
	private String descricao;
	@Column(name = "url_foto")
	private String url_foto;
	@Column(name = "url_video")
	private String url_video;
	@Column(name = "latitude")
	private String latitude;
	@Column(name = "longitude")
	private String longitude;
	@Column(name = "tipo")
	private String tipo;

	public Carro(Long id, String nome) {
		this.id = id;
		this.nome = nome;
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
	
}
