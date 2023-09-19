package br.com.flaviovicentini.LessonJavaWeb;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.com.flaviovicentini.LessonJavaWeb.negocio.Sobremesa;

@Order(3)
@Component
public class SobremesaLoader implements ApplicationRunner	{

	@Override
	public void run(ApplicationArguments args) throws Exception {
		var sobremesa1 = new Sobremesa("Torta de Limão", 18.20f, 3010, 1, true, "Pedaço de torta de limão servida no prato");
		
		System.out.println("Sobremesa incluída com sucesso: " + sobremesa1);
	}

}
