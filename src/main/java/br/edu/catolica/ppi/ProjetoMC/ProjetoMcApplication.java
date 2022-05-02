package br.edu.catolica.ppi.ProjetoMC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@SpringBootApplication
public class ProjetoMcApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoMcApplication.class, args);
	}

}
