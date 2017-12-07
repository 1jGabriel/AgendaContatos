package model;

public class Contato {
	
	private int id;
	private String nome;
	private String telefone;
	private String email;
	private String celular;
	
	public Contato(String nome, String telefone, String celular, String email) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.celular = celular;
		this.email = email;
	}
	
	
	
	public Contato(int id, String nome, String telefone, String celular, String email) {
		super();
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
		this.celular = celular;
		this.email = email;
	}



	public Contato() {
		// TODO Auto-generated constructor stub
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
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}



	@Override
	public String toString() {
		return "Contato [id=" + id + ", nome=" + nome + ", telefone=" + telefone + ", email=" + email + ", celular="
				+ celular + "]";
	}
	

}
