package com.stefanini.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import com.stefanini.model.Endereco;
import com.stefanini.model.Imagem;
import com.stefanini.model.Perfil;

public class PessoaDto implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long id;
	private String nome;
	private String email;
	private LocalDate dataNascimento;
	private Boolean situacao;
	private Imagem imagem;
	private Set<Endereco> enderecos = new HashSet<>();
	private Set<Perfil> perfils = new HashSet<>();

	public PessoaDto() {
		super();
	}

	public PessoaDto(Long id, String nome, String email, LocalDate dataNascimento, Boolean situacao,
			Set<Endereco> enderecos, Set<Perfil> perfils) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.dataNascimento = dataNascimento;
		this.situacao = situacao;
		this.enderecos = enderecos;
		this.perfils = perfils;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Boolean getSituacao() {
		return situacao;
	}

	public void setSituacao(Boolean situacao) {
		this.situacao = situacao;
	}

	public Set<Endereco> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(Set<Endereco> enderecos) {
		this.enderecos = enderecos;
	}

	public Set<Perfil> getPerfils() {
		return perfils;
	}

	public void setPerfils(Set<Perfil> perfils) {
		this.perfils = perfils;
	}

	public Imagem getImagem() {
		return imagem;
	}

	public void setImagem(Imagem imagem) {
		this.imagem = imagem;
	}
	
	@Override
	public String toString() {
		return "PessoaDto [id=" + id + ", nome=" + nome + ", email=" + email + ", dataNascimento=" + dataNascimento
				+ ", situacao=" + situacao + ", enderecos=" + enderecos + ", perfils=" + perfils + ", imagem=" + imagem
				+ "]";
	}
}
