package ecom.products.productApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("ecom.*")
public class EcomProductsApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcomProductsApplication.class, args);
	}

}
