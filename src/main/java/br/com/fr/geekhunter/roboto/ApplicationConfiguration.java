package br.com.fr.geekhunter.roboto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("file:./roboto.properties")
@ConfigurationProperties
public class ApplicationConfiguration {
	
	@Autowired
	Environment env;
	
	@Bean
	public ApplicationConfiguration configure() {
		ApplicationConfiguration appConf = new ApplicationConfiguration();
		return appConf;
	}

}
