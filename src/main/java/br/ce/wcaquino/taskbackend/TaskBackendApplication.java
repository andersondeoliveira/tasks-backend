package br.ce.wcaquino.taskbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class TaskBackendApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(TaskBackendApplication.class, args);
	}
}
