package br.com.flaviovicentini.LessonJavaWeb;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.com.flaviovicentini.LessonJavaWeb.negocio.Pedido;

@Order(5)
@Component
public class PedidoLoader implements ApplicationRunner	{

	@Override
	public void run(ApplicationArguments args) throws Exception {
		var pedido1 = new Pedido();
		
		System.out.println("Pedido incluído com sucesso: " + pedido1);
	}

}
