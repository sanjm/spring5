package hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringReactiveApplication {
	
	private final Logger log = LoggerFactory.getLogger(SpringReactiveApplication.class);

	public static void main(String[] args) throws Exception {
		SpringApplication.run(SpringReactiveApplication.class, args);
	}
}
