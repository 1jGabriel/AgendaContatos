package model;

public class Contato {
	
	private int id;
	private String nome;
	private int telefone;
	private int celular;
	private String email;
	
	public Contato(String nome, int telefone, int celular, String email) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.celular = celular;
		this.email = email;
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
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public int getCelular() {
		return celular;
	}
	public void setCelular(int celular) {
		this.celular = celular;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

}
