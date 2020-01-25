package com.example.carros.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Data
public class Carro {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nome;
    private String tipo;
	
    
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
		// TODO Auto-generated method stub
				return this.id;
	}

	public Carro() {
		super();
	}

	public Object getNome() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getTipo() {      
		// TODO Auto-generated method stub
		return null;
	}

	public void setNome(Object nome2) {
		// TODO Auto-generated method stub
		
	}

	public void setTipo(Object tipo2) {
		// TODO Auto-generated method stub
		
	}
	
}
