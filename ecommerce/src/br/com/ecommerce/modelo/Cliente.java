package br.com.ecommerce.modelo;

public class Cliente {
	private int id;
	private String nome;
	private String email;
	private String fone;
	private Endereco endereco;
	
	public Cliente() {
		super();
	}

	public Cliente(int id, String nome, String email, String fone, Endereco endereco) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.fone = fone;
		this.endereco = endereco;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", email=" + email + ", fone=" + fone + ", endereco=" + endereco
				+ "]";
	}

	public String getUsuario() {
		if (email.contains("@")) {
			return email.substring(email.indexOf('@'));
		}
		else {
			return email;
		}
	}
}
