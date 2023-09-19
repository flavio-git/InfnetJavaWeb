package br.com.flaviovicentini.LessonJavaWeb.negocio;

public class Comida extends Produto {

	private float peso;
	private boolean isVegano;
	private String ingredientes;
	
	public Comida(String nome, float valor, int codigo, float peso, boolean isVegano, String ingredientes) {
		super(nome, valor, codigo);
		this.peso = peso;
		this.isVegano = isVegano;
		this.ingredientes = ingredientes;
	}
	
	@Override
	public String toString() {
		return String.format("%s - Comida[%.2f, %s, %s]", super.toString(), peso, isVegano, ingredientes);
	}
}
