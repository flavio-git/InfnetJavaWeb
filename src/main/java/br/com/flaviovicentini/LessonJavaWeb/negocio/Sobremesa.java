package br.com.flaviovicentini.LessonJavaWeb.negocio;

public class Sobremesa extends Produto {

	private float quantidade;
	private boolean isDoce;
	private String informacao;
	
	public Sobremesa(String nome, float valor, int codigo, float quantidade, boolean isDoce, String informacao) {
		super(nome, valor, codigo);
		this.quantidade = quantidade;
		this.isDoce = isDoce;
		this.informacao = informacao;
	}
	
	@Override
	public String toString() {
		return String.format("%s - Sobremesa[%.2f, %s, %s]", super.toString(), quantidade, isDoce, informacao);
	}
}
