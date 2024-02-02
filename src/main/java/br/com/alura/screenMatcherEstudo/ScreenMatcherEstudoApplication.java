package br.com.alura.screenMatcherEstudo;

import br.com.alura.screenMatcherEstudo.principal.Principal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenMatcherEstudoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenMatcherEstudoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal();
		principal.exibMenu();
	}
}
