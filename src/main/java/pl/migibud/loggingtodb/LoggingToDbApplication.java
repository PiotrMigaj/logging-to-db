package pl.migibud.loggingtodb;

import org.apache.logging.log4j.LogManager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoggingToDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoggingToDbApplication.class, args);
		LogManager.getLogger(LoggingToDbApplication.class).info("Hello world");
	}

}
