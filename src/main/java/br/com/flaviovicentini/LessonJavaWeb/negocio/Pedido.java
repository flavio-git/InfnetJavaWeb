package br.com.flaviovicentini.LessonJavaWeb.negocio;

import java.time.LocalDateTime;

public class Pedido {

	private String descricao;
	private LocalDateTime data;
	private boolean isWeb;

	public Pedido() {
		descricao = "Pedido inicial";
		data = LocalDateTime.now();
		isWeb = true;
	}

	@Override
	public String toString() {
		return String.format("Pedido=[%s, %s, %s]", descricao, data, isWeb);
	}
}
