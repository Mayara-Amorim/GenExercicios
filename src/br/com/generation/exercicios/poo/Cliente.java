package br.com.generation.exercicios.poo;

public class Cliente {
	
	private String nome;
	private String endereco;
	private String email;
	private String cpf;
	private String telefone;
	public Cliente(String nome, String endereco, String email, String cpf,
			String telefone) {
		this.nome = nome;
		this.endereco = endereco;
		this.email = email;
		this.cpf = cpf;
		this.telefone = telefone;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getendereco() {
		return endereco;
	}
	public void setendereco(String endereco) {
		this.endereco = endereco;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public void visualizar() {
		System.out.println(
		"Nome: "	 + this.getNome() + ", CPF: " + this.getCpf()
		+ ", Email: " + this.email +
		", Telefone: " + this.getTelefone()
		+ ", Endereco: "+ endereco);
	}

}
