package br.com.flaviovicentini.LessonJavaWeb.negocio;

public class Bebida extends Produto {

	private boolean isGelada;
	private float tamanho;
	private String marca;
	
	public Bebida(String nome, float valor, int codigo, boolean isGelada, float tamanho, String marca) {
		super(nome, valor, codigo);
		this.isGelada = isGelada;
		this.tamanho = tamanho;
		this.marca = marca;
	}
	
	@Override
	public String toString() {
		return String.format("%s - Bedida[%s, %.2f, %s]", super.toString(), isGelada, tamanho, marca);
	}
	
}
