package br.com.flaviovicentini.LessonJavaWeb.negocio;

public class Solicitante {
	private String nome;
	private String cpf;
	private String email;
	
	public Solicitante(String nome, String cpf, String email) {
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
	}
	
	@Override
	public String toString() {
		return String.format("Solicitante=[%s, %s, %s]", nome, cpf, email);
	}
}
