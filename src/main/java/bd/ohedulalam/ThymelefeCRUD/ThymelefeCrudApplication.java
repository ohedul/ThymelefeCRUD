package bd.ohedulalam.ThymelefeCRUD;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = "bd.ohedulalam.ThymelefeCRUD")
@EnableJpaRepositories(basePackages = "bd.ohedulalam.ThymelefeCRUD.repository")
@EnableTransactionManagement
@EntityScan(basePackages = "bd.ohedulalam.ThymelefeCRUD.model")
public class ThymelefeCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThymelefeCrudApplication.class, args);
	}

}
