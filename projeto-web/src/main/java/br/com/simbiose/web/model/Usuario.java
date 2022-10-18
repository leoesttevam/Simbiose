package br.com.simbiose.web.model;

public class Usuario {

	private Long id;
	
	private String nome;
	
	private Integer dataNascimento;

	public Usuario() {
		super();
	}

	public Usuario(Long id, String nome, Integer dataNascimento) {
		super();
		this.id = id;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
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

	public Integer getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Integer dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	
}
