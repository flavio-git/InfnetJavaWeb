package br.com.flaviovicentini.LessonJavaWeb;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.com.flaviovicentini.LessonJavaWeb.negocio.Bebida;

@Order(2)
@Component
public class BebidaLoader implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		var bebida1 = new Bebida("Coca-Cola", 8.00f, 2010, true, 600f, "Coca-Cola");

		System.out.println("Bebida incluída com sucesso: " + bebida1);
	}

}
