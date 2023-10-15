package se331.lab.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@ComponentScan("se331.lab.rest")
public class Application {

	/**
	 * @param args
	 */
	public static void main(java.lang.String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				// registry.addMapping("/events").allowedOrigins("http://localhost:3000");
				// registry.addMapping("/events/*").allowedOrigins("http://localhost:3000");
				// make it look more easier
				registry.addMapping("/**").allowedOrigins("http://localhost:3000")
						.exposedHeaders("x-total-count");
			}
		};
	}

}
