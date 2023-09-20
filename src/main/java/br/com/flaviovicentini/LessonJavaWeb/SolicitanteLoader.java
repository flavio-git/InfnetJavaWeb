package br.com.flaviovicentini.LessonJavaWeb;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.com.flaviovicentini.LessonJavaWeb.negocio.Solicitante;

@Order(4)
@Component
public class SolicitanteLoader implements ApplicationRunner	{

	@Override
	public void run(ApplicationArguments args) throws Exception {
		var solicitante1 = new Solicitante("Ricardo Silva Petry", "001.002.000-00", "ricardo@email.com");
		
		System.out.println("Solicitante incluído com sucesso: " + solicitante1);
	}

}
