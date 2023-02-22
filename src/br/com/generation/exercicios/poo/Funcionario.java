package br.com.generation.exercicios.poo;

public class Funcionario {
	private String nome;
	private String email;
	private String cpf;
	private String endereco;
	private String tipoContrato;
	public Funcionario(String nome, String email, String cpf, String endereco, String tipoContrato) {
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
		this.endereco = endereco;
		this.tipoContrato = tipoContrato;
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
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTipoContrato() {
		return tipoContrato;
	}
	public void setTipoContrato(String tipoContrato) {
		this.tipoContrato = tipoContrato;
	}
	public void visualizar() {
		System.out.println("Nome: " + this.getNome() +
				", CPF: " + cpf + ", Endereco: "+ this.endereco +
				", Email: " + this.getEmail() + ", Tipo de Contrato: " + tipoContrato);
	}

}
