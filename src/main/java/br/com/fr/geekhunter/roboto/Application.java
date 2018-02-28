package br.com.fr.geekhunter.roboto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Main application to run boot application.
 * 
 */
@SpringBootApplication
@ComponentScan(basePackages = {"br.com.fr.geekhunter.roboto"})
@EnableScheduling
public class Application {
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(Application.class, args);
	}
	
}