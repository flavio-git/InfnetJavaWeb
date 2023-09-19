package br.com.flaviovicentini.LessonJavaWeb;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.com.flaviovicentini.LessonJavaWeb.negocio.Comida;

@Order(1)
@Component
public class ComidaLoader implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		var comida1 = new Comida("Omelete", 20.50f, 1010, 120, false, "Ovo, tomate, queijo, bacon");

		System.out.println("Comida incluída com sucesso: " + comida1);
	}

}
