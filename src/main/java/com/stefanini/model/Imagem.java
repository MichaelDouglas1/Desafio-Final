package com.stefanini.model;

import java.io.Serializable;

public class Imagem implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String nome;
    private String tipo;
    private String base64;

    public Imagem() {
        super();
    }

    public Imagem(String nome, String tipo, String base64) {
        super();
        this.nome = nome;
        this.tipo = tipo;
        this.base64 = base64;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getBase64() {
        return base64;
    }

    public void setBase64(String base64) {
        this.base64 = base64;
    }

}