package br.com.tt.cliente;

import java.util.Date;


import org.springframework.format.annotation.DateTimeFormat;

public class Cliente {

	private Long id;
	private String nome;
	private String cpf;
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	private Date data;
	
	



	public Cliente(Long id, String nome, String cpf, Date data) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.data = data;
	}

	public Cliente() {
		// TODO Auto-generated constructor stub
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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

}
