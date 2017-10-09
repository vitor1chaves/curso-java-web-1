package br.com.tt.cliente;

import static javax.persistence.GenerationType.AUTO;
import static javax.persistence.TemporalType.DATE;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;


@Entity
public class Cliente {

	@Id
	@GeneratedValue(strategy = AUTO)
	private Long id;
	@Column(nullable = false)
	@NotBlank(message="Nome é informação Obrigatório")
	private String nome;
	@Column(length = 11)
	@NotBlank(message="Cpf é informação Obrigatório")
@Pattern(regexp="\\d{11}", message="Cpf necessita ter 11 Digitos")
	private String cpf;
	@Temporal(DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
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
