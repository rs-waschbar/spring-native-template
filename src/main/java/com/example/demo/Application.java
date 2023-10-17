package com.example.demo;

import com.example.demo.config.RuntimeHints;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportRuntimeHints;

import java.util.function.Function;

@SpringBootApplication
@ImportRuntimeHints(RuntimeHints.class)
@Slf4j
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public Function<String, String> function() {
		log.info("Invoke function");
		return value -> invokeMethod(value);
	}

	private String invokeMethod(String value) {
		return value.toUpperCase();
	}


}
