package pl.inteca.FamilyApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class FamilyAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FamilyAppApplication.class, args);
	}

}
